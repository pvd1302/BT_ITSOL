package bassic;

import java.util.Scanner;
public class baitap3 {
    public static int UCLN(int a, int b) {
        if (b == 0) return a;
        return UCLN(b,a % b);
    }
    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên a :");
        int a = sc.nextInt();
        System.out.println("Nhập số nguyên b :");
        int b = sc.nextInt();

        //tinh SCLN
        System.out.println("USCLN của " + a + " và " + b +" là: " + UCLN(a, b));
        // tính BCNN
        System.out.println("BSCNN của " + a + " và " + b + " là: " + BCNN(a, b));
    }
}
