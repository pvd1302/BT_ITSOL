package array;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        int n, x, index = -1, temp = -1, min =2147483647;
        int [] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào giá trị n, x :");
        n = sc.nextInt();
        x = sc.nextInt();

        array = new int[n];

        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            int currentMin = getmin(array[i], x);
            if (ngto(array[i]) && currentMin < min){
                min = currentMin;
                index = i;
            }
            if (index != 1){
                System.out.println("Chỉ số phần tử "+index+" giá trị ="+array[index]);
            }else {
                System.out.println("không tồn tại gt thỏa mãn :");
            }
        }
    }
    public  static int getmin(int a, int x){
        return Math.abs(a-x);
    }
    public  static boolean ngto(int n){
        int a =(int) Math.sqrt(n);
        for (int i = 2; i <= a; i++){
            if(n % i == 0){
                return true;
            }
        }
        return true;
    }
}
