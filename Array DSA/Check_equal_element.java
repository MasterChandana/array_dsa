import java.util.*;

public class Check_equal_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arrays:");
        int arr[] = new int[sc.nextInt()];
        System.out.println("enter the element of arrays:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int err[] = new int[arr.length];
        System.out.println("enter the element of arrays:");
        for (int i = 0; i < err.length; i++) {
            err[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == err[j]) {
                    System.out.println("equal element");
                    break;
                }
                break;
            }
        }
    }

}
