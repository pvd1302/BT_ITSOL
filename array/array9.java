package array;

import java.util.Scanner;

public class array9 {
    public static void main (String[] args) throws java.lang.Exception
    {
        int n, m;
        Scanner  sc = new Scanner(System.in);
        System.out.println("Nhập số hàng n :");
        n = sc.nextInt();
        System.out.println("Nhập số cột m :");
        m = sc.nextInt();
        int nm = n*m;
        int A[] = new int[nm];

        for (int i = 0; i < nm; i++) {
            System.out.println("Nhập vào phần tử "+i);
            A[i] = sc.nextInt();
        }

        for(int i = 0 ; i < nm ; i++){
            for(int j = i+1 ; j < nm ; j++){
                if(A[i] > A[j]){
                    int x = A[j];
                    A[j] = A[i];
                    A[i] = x;
                }
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.println("Kết quả liệt kê :");
                System.out.print(A[i*m+j]+" ");
            }
            System.out.println();
        }
    }
}
