package bassic;

public class baitap10 {
    public void litke7chuso(){

        System.out.println("Danh sách các số: ");
        for (int i = 1000000; i <9999999 ; i++) {
            if(Songuyeto(i)){
                if (Checkcacchuso(i)){
                    if (Songuyeto(Daonguocso(i))){
                        System.out.print(i+" ");
                    }

                }

            }
        }
    }

    public boolean Songuyeto(int n){

        if (n < 2) {
            return false;
        }


        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean Checkcacchuso(int n){
        while (n>0){
            if((n%10)!=2 && (n%10)!=3 && (n%10)!=5 && (n%10)!=7){
                return false;
            }
            n=n/10;
        }
        return true;
    }

    public int Daonguocso(int n){
        int tmp=0;
        while(n != 0) {
            int digit = n % 10;
            tmp = tmp * 10 + digit;
            n /= 10;
        }
        return tmp;
    }

    public boolean Checksodaonguoc(int n){
        if(Songuyeto(n)!=true) {

        }
        return true;
    }

    public static void main(String[] args) {

        baitap10 b10=new baitap10();

        b10.litke7chuso();

    }
}
