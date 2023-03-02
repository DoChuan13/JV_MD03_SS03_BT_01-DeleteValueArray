package DeleteArrayObject;

import java.util.Scanner;

public class DeleteArrayObject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr;
        int n;
        do {
            System.out.print("Enter array's length array: ");
            n = input.nextInt();
            if (n > 20) {
                System.out.println("Array's length exceed 20, please try again.");
            }
        } while (n > 20);

        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Input the element %d: ", (i + 1));
            arr[i] = input.nextInt();
        }
        System.out.print("\nCurrent Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.print("\nInput element need delete: ");
        int deleteElement = input.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == deleteElement) {
                index = i;
                break;
            }
        }
        int[] newArr = new int[n - 1];

        if (index < 0) {
            System.out.println("No found this element!!!");
        } else {
            System.out.print("\nNew Array: ");
            for (int i = 0; i < newArr.length; i++) {
                if (i < index) {
                    newArr[i] = arr[i];

                } else {
                    newArr[i] = arr[i + 1];
                }
                System.out.print(newArr[i] + "\t");
            }

        }
    }
}
