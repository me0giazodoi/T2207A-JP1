package session1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");
        int x = 10;
        double y = 3.14;
        String s = "Hello";
        System.out.println("x= "+x);
        y = y + 20 *x;

        if(y>100){
            System.out.println("y = "+y);
        }else{
            System.out.println("x ="+x);
        }

        for(int i=0;i<10;i++){
            System.out.println("i = "+i);
        }

        //Tính S = 1 + 2 + 3+ 4 + ... + 1000
        int S1 = 0;
        for(int i=1;i<=1000;i++){
            S1 = S1 +i;
        }
        System.out.println("S1 = "+S1);
        //Tính S = 1 + 1/2+ 1/3+ ... + 1/1000
        double S2 = 0;
        for(int i=1;i<=1000;i++){
            S2 = S2 + (double) 1/i;
        }
        System.out.println("S2 = "+S2);

        int z = tinhTong(10,15);
        boolean t = true;

        //Nhập một số nguyên từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so nguyen:");
        int n = sc.nextInt();

        System.out.println("Nhap 1 so thuc:");
        double d = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap 1 string:");
        String str = sc.nextLine();
        System.out.println("n: "+n);
        System.out.println("d: "+d);
        System.out.println("str: "+str);

        //Nhập một số nguyen a từ bàn phím
        System.out.println("Nhap 1 so nguyen:");
        int a = sc.nextInt();
        System.out.println("n: "+a);

        //Tính tổng S= 1+2+3+...+a
        int S = 0;
        for(int i=1;i<=a;i++){
            S = S+i;
        }
        System.out.println("S: "+S);

        //Kiểm tra a có phải số nguyên tố hay không
        if (a==1){
            System.out.println(a+" khong phai so nguyen to");
        }else{
            int b = 0;
            for(int i=2;i<=a;i++){
                if (i!=a && a%i==0){
                    b++;
                }
            }
            if (b==0){
                System.out.println(a+" la so nguyen to");
            }else{
                System.out.println(a+" khong phai la so nguyen to");
            }
        }
    }
    static int tinhTong(int a,int b){
        return a+b;
    }
    static int tinhHieu(int a,int b){
        return a-b;
    }
    static int tinhTich(int a,int b){
        return a*b;
    }
    static int tinhThuong(int a,int b){
        return b==0?null:a/b;
    }
}