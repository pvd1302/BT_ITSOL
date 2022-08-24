package bassic;

import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen a:");
        int a= sc.nextInt();
        System.out.println(("Nhap vao so nguyen b"));
        int b = sc.nextInt();

        for (int i = a; i <=b; i++){
            int dem = 0;
            for (int j=2; j<=i; j++){
                if (i % j == 0){
                    dem+=1;
                }
            }if(dem<=1){
                System.out.println(i);
            }
        }
    }
}
