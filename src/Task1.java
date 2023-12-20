import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static boolean isSorted(int[] arr) {
        boolean isSorted = false;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] > arr[i]) {
                return isSorted;
            }
        }

        return !isSorted;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println(isSorted(array));

    }
}
