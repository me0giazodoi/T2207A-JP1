package session2;

import java.util.Scanner;

public class HotGirl {
    String name;
    String birthday;
    String address;
    public HotGirl(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        System.out.println("Nhập năm sinh: ");
        birthday = sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        address = sc.nextLine();
    }
    public void playGame(){
        System.out.println("Playing Game ...");
    }
    public void quetNha(){
        System.out.println("Đang quét nhà ...");
    }
    public void ruaBat(){
        System.out.println("Đang rửa bát ...");
    }
}
