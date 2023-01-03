package session2;

import java.util.Scanner;

public class PhanSo {
    //Các thuộc tính
    int tuSo;
    int mauSo;
    int tuSo2;
    int mauSo2;
    //In phân số
    public PhanSo(){
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập tử số: ");
            tuSo = sc.nextInt();
            System.out.println("Nhập mẫu số: ");
            mauSo = sc.nextInt();
            if (mauSo==0){
                System.out.println("Mẫu số phải khác 0 vui lòng nhập lại !");
            }
        }while (kiemTra());
        //In phân số
        if (tuSo*mauSo==0){
            System.out.println("Phân số vừa nhập có kết quả là 0");
        }else{
            if(tuSo * mauSo < 0) {
                System.out.println("Phân số vừa nhập là: -" + Math.abs(tuSo) + "/" + Math.abs(mauSo));
            }else{
                System.out.println("Phân số vừa nhập là: "+Math.abs(tuSo) + "/" + Math.abs(mauSo));
            }
        }
        // Rút gọn phân số
        int soLon;
        int soNho;
        int ucln = 0;
        if (tuSo<mauSo){
            soNho = tuSo;
            soLon = mauSo;
        }else{
            soNho = mauSo;
            soLon = tuSo;
        }
        if (soLon % soNho == 0){
            ucln = soNho;
        }else{
            for(int i=2; i < soNho; i++){
                if(soLon % i == 0 && soNho % i == 0){
                    ucln = i;
                }
            }
        }
        tuSo /= ucln;
        mauSo /= ucln;
        if (tuSo*mauSo==0){
            System.out.println("Phân số có kết quả là 0");
        }else{
            if(tuSo * mauSo < 0) {
                System.out.println("Phân số rút gọn là: -" + Math.abs(tuSo) + "/" + Math.abs(mauSo));
            }else{
                System.out.println("Phân số rút gọn là: "+Math.abs(tuSo) + "/" + Math.abs(mauSo));
            }
        }
        // Nghịch đảo phân số
        int n=0;
        n=tuSo;
        tuSo=mauSo;
        mauSo=n;
        if (tuSo*mauSo==0){
            System.out.println("Phân số có kết quả là 0");
        }else{
            if(tuSo * mauSo < 0) {
                System.out.println("Phân số nghịch đảo là: -" + Math.abs(tuSo) + "/" + Math.abs(mauSo));
            }else{
                System.out.println("Phân số nghịch đảo là: "+Math.abs(tuSo) + "/" + Math.abs(mauSo));
            }
        }
        //Trả về phân số ban đầu
        int m;
        m=tuSo;
        tuSo=mauSo;
        mauSo=m;
        //Phân số 2
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập tử số: ");
            tuSo2 = sc.nextInt();
            System.out.println("Nhập mẫu số: ");
            mauSo2 = sc.nextInt();
            if (mauSo2==0){
                System.out.println("Mẫu số phải khác 0 vui lòng nhập lại !");
            }
        }while (kiemTra());
        //In phân số
        if (tuSo2*mauSo2==0){
            System.out.println("Phân số vừa nhập có kết quả là 0");
        }else{
            if(tuSo2 * mauSo2 < 0) {
                System.out.println("Phân số vừa nhập là: -" + Math.abs(tuSo2) + "/" + Math.abs(mauSo2));
            }else{
                System.out.println("Phân số vừa nhập là: "+Math.abs(tuSo2) + "/" + Math.abs(mauSo2));
            }
        }
    }
    public boolean kiemTra(){
        return mauSo==0;
    }
    // Cộng 2 phân số
    public String add(){
        int tsc = (tuSo * mauSo2) + (tuSo2 * mauSo);
        int msc = mauSo2 * mauSo;
        String psc= tsc + "/" + msc;;
        return psc;
    }
    // Trừ 2 phân số
    public String sub(){
        int tst = (tuSo * mauSo2) - (tuSo2 * mauSo);
        int mst = mauSo2 * mauSo;
        String pst= tst + "/" + mst;;
        return pst;
    }
    // Nhân 2 phân số
    public String mul(){
        int tsn = tuSo * tuSo2;
        int msn = mauSo * mauSo2;
        String psn= tsn + "/" + msn;;
        return psn;
    }
    // Chia 2 phân số
    public String div(){
        int tsc = tuSo * mauSo2;
        int msc = mauSo * tuSo2;
        String psc= tsc + "/" + msc;;
        return psc;
    }
}
