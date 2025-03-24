
import java.util.*;;

public class Duplicate_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arrays:");
        int arr[] = new int[sc.nextInt()];
        System.out.println("enter the element of arrays:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("your elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("duplicate element is:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                } else {

                    System.out.println("no duplicate");
                    break;

                }
                
            }break;
        }

    }

}
