package bassic;

public class baitap9 {
    public void lietke() {
        int count=0;
        for(int i=1000000;i<999999999;i++) {
            int tmp=0;
            int n=i;
            while(n>0) {
                tmp=tmp*10+n%10;
                n/=10;
            }
            if(i==tmp) {
                if(Check068(i)==true){
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
    }

    public boolean Check068(int n){
        while (n>0){
            if(n%10!=0 && n%10!=6 && n%10!=8){
                return false;
            }
            n=n/10;
        }
        return true;
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
        baitap9 b9=new baitap9();
        b9.lietke();
    }
}
