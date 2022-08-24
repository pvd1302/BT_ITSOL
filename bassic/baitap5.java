package bassic;

import java.util.Scanner;

public class baitap5 {
    public static int tinhTong(long i) {

        int sum = 0;
        long n;
        while (i != 0) {
            n = i % 10;
            sum += n;
            i /= 10;
        }
        return (sum);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap day so bat ky: ");
        int n = sc.nextInt();
        System.out.println("Tong cua so "+n+" = " +tinhTong(n));
    }
}
