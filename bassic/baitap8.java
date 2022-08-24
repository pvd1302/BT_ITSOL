package bassic;

public class baitap8 {
    public void caua() {
        int count=0;
        for(int i=100000;i<999999;i++) {
            int tn=0;
            int n=i;
            while(n>0) {
                tn=tn*10+n%10;
                n/=10;
            }
            if(i==tn) {
                System.out.printf("%10d",i);
                count++;
                if(count%10==0) {
                    System.out.println();
                }

            }
        }
    }
    public void caub() {
        int count=0;
        for(int i=100000;i<999999;i++) {
            int tn=0;
            int n=i;
            while(n>0) {
                tn=tn*10+n%10;
                n/=10;
            }
            if(i==tn) {

                if(Tongcacchuso(i)%10==0){
                    System.out.printf("%10d",i);
                    count++;
                    if(count%10==0) {
                        System.out.println();
                    }
                }
            }
        }
    }
    public int Tongcacchuso(int n){

        int tong=0;
        while (n>0){
            tong+=n%10;
            n=n/10;

        }
        return tong;
    }
    public static void main(String[] args) {

        baitap8 b8= new baitap8();
        System.out.println("cac so thuan nghich co 6 chu so");
        b8.caua();
        System.out.println("");
        System.out.println("//////////////////////////////");
        System.out.println("cac so thuan nghich tong cac chu so chia het cho 10");
        b8.caub();
    }
}
