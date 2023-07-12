import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        System.out.println(findNumber(arr, n, num));
        sc.close();
    }

    static int findNumber(int[] arr,int n,int num) {
        int count = 0;
        for(int i=0;i<n;i++) {
            if(num == arr[i]) {
                count++;
            }
        }
        return count;
    }
}