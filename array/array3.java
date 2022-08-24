package array;

import java.util.Scanner;
public class array3 {
    public void Demvaxuatphantu(){
        Scanner sc=new Scanner(System.in);
        int n;
        int cout[]=new int[100];
        do{
            System.out.print("Nhap so phan tu cua mang: ");
            n=sc.nextInt();
        }while ( n<=0);
        int A[]=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cac phan tu trong mang:");
            A[i]=sc.nextInt();
            cout[i]=-1;
        }

        //dem so lan cac phan tu xuat hien
        for (int i = 0; i < n; i++) {
            int dem=1;
            for (int j = i+1; j <n ; j++) {
                if(A[i]==A[j]){
                    dem++;
                    cout[j]=0;
                }
            }

            if(cout[i]!=0){
                cout[i]=dem;
            }
        }

        for (int i = 0; i < n; i++) {
            if(cout[i]!=0){
                System.out.println("So "+A[i]+"xuat hien"+cout[i]+"lan");
            }
        }


        int B[]=new int[A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j <=i; j++) {
                if(A[i]==A[j]){
                    B[i]++;
                }
            }

        }
        int max=B[0];
        for (int i = 1; i < A.length; i++) {
            if(B[i]>max){
                max=B[i];
            }
        }
        for (int i=0;i<A.length;i++){
            if(B[i]==max){
                System.out.println("Phan tu "+A[i]+"xuat hien nhieu nhat "+max+" lan");
            }
        }

    }
    public static void main(String[] args) {

        array3 b3=new array3();
        b3.Demvaxuatphantu();
    }
}
