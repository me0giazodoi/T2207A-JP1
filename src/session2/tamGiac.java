package session2;

import java.util.Scanner;

public class tamGiac {
    int a;
    int b;
    int c;
    public tamGiac(){
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập cạnh a: ");
            a = sc.nextInt();
            System.out.println("Nhập cạnh b: ");
            b = sc.nextInt();
            System.out.println("Nhập cạnh c: ");
            c = sc.nextInt();
//        if(a<b+c && b<a+c && c<a+b){
//            int p=a+b+c;
//            System.out.println("Chu vi tam giác là: "+p);
//            float p2=(float) p/2;
//            double s=Math.sqrt(p2*(p2-a)*(p2-b)*(p2-c));
//            System.out.println("Diện tich của tam giác là: "+s);
//        }else{
//            System.out.println("a b c không phải 3 cạnh của tam giác");
//        }
        }while (!kiemTra());
    }
    public boolean kiemTra(){
        return a<b+c && b<a+c && c<a+b;
    }
    public int tinhChuVi(){
        return a+b+c;
    }
    public double tinhDienTich(){
        double p = tinhChuVi()/2.0;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
}
