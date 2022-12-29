package session1;

import java.util.Scanner;

public class Buoi2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một số nguyên n:");
        int n = sc.nextInt();
        // Nhập 1 số nguyên n, kiểm tra nó có phải số hoàn hảo hay không.
        int S=0;
        for(int i=1;i<=n/2;i++){
            if (n%i==0){
                S+=i;
            }
        }
        if(S==n){
            System.out.println(n+" là số hoàn hảo");
        }else{
            System.out.println(n+" là số không hoàn hảo");
        }

        // Nhập 1 số nguyên n, tìm số có vị trí thứ n của dãy Fibonaci.
        int o;
        int p;
        int q;
        o=p=q=1;
        for(int i=3;i<=n;i++){
            o=p+q;
            p=q;
            q=o;
        }
        System.out.println("Số Fibonaci thứ "+n+" là "+o);

        // Nhập 2 số nguyên, tìm ước chung lớn nhất và bội chung nhỏ nhất của 2 số đó.
        System.out.println("Nhập số nguyên thứ nhất:");
        int a = sc.nextInt();
        System.out.println("Nhập số nguyên thứ hai:");
        int b = sc.nextInt();
        int So_lon;
        int So_nho;
        int ucln = 0;
        int bcnn = 0;
        if (a<b){
            So_nho = a;
            So_lon = b;
        }else{
            So_nho = b;
            So_lon = a;
        }
        if (So_lon % So_nho == 0){
            ucln = So_nho;
        }else{
            for(int i=2; i < So_nho; i++){
                if(So_lon % i == 0 && So_nho % i == 0){
                    ucln = i;
                }
            }
        }
        System.out.println("Ước chung lớn nhất là "+ucln);
        if (So_lon % So_nho == 0){
            bcnn = So_lon;
        }else{
            for(int i = So_lon * So_nho;i >= So_lon; i--){
                if (i % So_lon == 0 && i % So_nho == 0){
                    bcnn = i;
                }
            }
        }
        System.out.println("Bội chung nhỏ nhất là "+bcnn);
    }
}
