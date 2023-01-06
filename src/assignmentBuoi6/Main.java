package assignmentBuoi6;

import session3.Car;

public class Main {
    public static void main(String[] args){
        PhoneNumber[] pn = new PhoneNumber[5];
        for (int i=0;i< pn.length;i++){
            pn[0] = new PhoneNumber("Nguyễn Văn A",123456789);
            pn[1] = new PhoneNumber("Nguyễn Văn B",987654321);
            pn[2] = new PhoneNumber("Nguyễn Văn C",123789456);
            pn[3] = new PhoneNumber("Nguyễn Văn D",456789123);
            pn[4] = new PhoneNumber("Nguyễn Văn E",135792468);
            System.out.println("Họ và tên: "+pn[i].getName());
            System.out.println("Số điện thoại: "+pn[i].getPhone());
        }
    }
}
