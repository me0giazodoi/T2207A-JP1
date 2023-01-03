package session2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        PhanSo Ps = new PhanSo();
        System.out.println("Tổng 2 phân số là: "+Ps.add());
        System.out.println("Hiệu 2 phân số là: "+Ps.sub());
        System.out.println("Tich 2 phân số là: "+Ps.mul());
        System.out.println("Thương 2 phân số là: "+Ps.div());
        //Xây dựng lớp tam giác có các thông tin gồm độ dài các cạnh
        // Sau đó viết các công thức tính chu vi và diên tích của tam giác
        tamGiac Tg = new tamGiac();
        System.out.println("Chu vi của tam giác là: "+Tg.tinhChuVi());
        System.out.println("Diện tích của tam giác là: "+Tg.tinhDienTich());

        int x = 10;
        x++;
        // age++;
        Student s1 = new Student();
        s1.age++;

        Student s2 = new Student();
        s2.eat();

        Student s3 = new Student();

        System.out.println("S1: "+s1.name);
        System.out.println("S1: "+s2.name);
        System.out.println("S1: "+s3.name);

        //array
        int[] arrNums = new int[10]; // Mảng 10 số nguyên
        arrNums[0] = 12;
        arrNums[1] = 9;

        for(int i=0;i<10;i++){
            arrNums[i] = i;
        }

        arrNums[9] = 18;
        arrNums[9]++;
        System.out.println(arrNums[9]);

        ArrayList<String> strs = new ArrayList<>();
        strs.add("Hello");
        strs.add("world");
        strs.add("every body");

        System.out.println(strs.get(0));
        System.out.println(strs.get(1));
        System.out.println(strs.get(2));

        for (int i=0; i<strs.size(); i++){
            System.out.println(strs.get(i));
        }

        // Mảng các sinh viên
        ArrayList<Student> sts = new ArrayList<>();
        sts.add(s1);
        sts.add(s2);
        sts.add(s3);

        sts.add(new Student());

        // Mảng triệu hồi HotGirl
        HotGirl Hg = new HotGirl();
        ArrayList<HotGirl> info = new ArrayList<>();
        info.add(Hg);
        for (int i=0; i<info.size(); i++){
            System.out.println(info.get(i).name);
            System.out.println(info.get(i).birthday);
            System.out.println(info.get(i).address);
        }
    }
}
