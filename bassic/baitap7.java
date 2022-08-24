package bassic;

import java.util.Scanner;

public class baitap7 {
    public boolean Songuyento(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public boolean CheckSo(int n){

        while (n>0){
            boolean a=n%10!=0?true:false;
            if(a==false){return false;}

            n=n/10;
        }
        return true;
    }


    public static void main(String[] args) {
        baitap7 b7=new baitap7();
        Scanner sc=new Scanner(System.in);


        System.out.print("Danh sach so nguyen to so co 6 chu so toan la so le: ");
        for (int i = 10; i < 99; i++) {
            if (b7.Songuyento(i)) {
                if(b7.CheckSo(i)){
                    System.out.print(", "+i);
                }

            }
        }
    }
}
