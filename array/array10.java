package array;

import java.util.Scanner;

public class array10 {
    public static void main (String[] args)
    {
        int n, sum = 0;
        Scanner  sc = new Scanner(System.in);
        System.out.println("Nhập số cấp của ma trận vuông n :");
        n = sc.nextInt();
        int A[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập vào phần tử A["+i+"]A["+j+"]");
                A[i][j] = sc.nextInt();
                if(i == j){
                    sum += A[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            sum += A[i][n-i-1];
        }
        if(n % 2 == 1){
            sum -= A[n/2][n/2];
        }
        System.out.println(sum);




    }
}
