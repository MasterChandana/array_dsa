import java.util.Scanner;
import java.util.Arrays;

public class Check_shorted_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of arrays:");
        int arr[] = new int[sc.nextInt()];
        int err[] = new int[arr.length];
        System.out.println("enter the element of arrays:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            err[i] = arr[i];
        }
        System.out.println("your elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("your  elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == err[j]) {
                    System.out.println("shorted array");
                    break;
                } else {
                    System.out.println("unshorted");
                    break;
                }
            }
            break;

        }

    }
}
