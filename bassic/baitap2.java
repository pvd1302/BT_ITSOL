package bassic;

import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên n :");
        int n = sc.nextInt();
        int dem = 0;
        for (int i=1; i<= n; i++){
            if(n%i==0){
                dem++;
                System.out.println(i+"\t");
            }
        }System.out.println("so luong uoc la:" +dem);
    }
}
