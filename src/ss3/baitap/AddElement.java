package ss3.baitap;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of numbers:");
        int amount = sc.nextInt();
        int[] arr = new int[amount];
        System.out.println("------Enter elements------");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("------Add an element------");
        int addedInt = sc.nextInt();
        System.out.println("------Position(Index)-----");
        int position = sc.nextInt();
        if (addedInt < 0 || addedInt > arr.length) {
            System.out.println("Invalid position");
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }
        newArr[position] = addedInt;
        for (int i = position + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
