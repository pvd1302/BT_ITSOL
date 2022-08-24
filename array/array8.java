package array;

import java.util.Scanner;

public class array8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, k;
        int[][] a, b, c;
        System.out.println("Nhập cấp ma trận a :");

        m = sc.nextInt();
        n = sc.nextInt();
        System.out.println("Nhập số cột ma trận b");
        k = sc.nextInt();
        System.out.println("Nhập ma trận a: ");
        a = nhap(n, k, sc);
        System.out.println("Nhập ma trận b: ");
        b = nhap(n, k, sc);
        System.out.println("Ma trận a:");
        xuat(a);
        System.out.println("Ma trận b:");
        xuat(b);
        System.out.println("Kết quả: ");
        c = nhanMT(a, b);
        xuat(c);

    }
    public static int[][] nhap(int m, int n, Scanner sc){
        int[][] x = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j =0; j < n; j++){
                x[i][j] = sc.nextInt();
            }
        }return x;
    }


    public static void xuat(int[][] x){
        for(int i = 0; i < x.length; i++){
            for (int j = 0; j < x[0].length; j++){
                System.out.printf("%5d", x[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] nhanMT(int[][] a, int[][] b){
        int[][] c = new int[a.length][b[0].length];
        int m = a.length;
        int n = b[0].length;
        int k = a[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j< n; j++){
                for (int l = 0; l < k; l++){
                    c[i][j] += a[i][l] * b[l][j];
                 }
            }
        }return c;

    }
}

