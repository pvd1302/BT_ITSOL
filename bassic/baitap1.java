package bassic;

import java.util.Scanner;

public class baitap1 {
    public static int sochan(int n){
        int s = 0;
        for (int i =2; i <= n; i+=2){
            s += i;
        }
        return s;
    }
    public static int sole(int n) {
        int s = 0;
        for (int i = 1; i <= n; i += 2) {
            s += i;
        }
        return s;
    }

    public static  float caub(int n){
        float s=0;
        for (int i=1; i <= n; i++){
            s +=1.0/i;
        }
        return s;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Nhap du lieu
        System.out.print("Nhập vào số nguyên : ");
        int n = sc.nextInt();

        //Hien thi kq
        if (n%2==0)
            System.out.println("câu a:Tổng từ 2 đến "+ n +" là :" +sochan(n)+"\ncau b:"+caub(n) );
        else if (n%2!=0) {
            System.out.println("Tổng từ 1 đến "+ n +" là :" +sole(n)+"\ncau b:"+caub(n) );

        }
    }
}
