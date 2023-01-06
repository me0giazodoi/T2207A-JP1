package session4;

import assignmentBuoi5.Student;
import session3.Car;

import java.util.ArrayList;

public class Main {
    public static void main(String[] agrs){
        Student[] hs = new Student[10];

        ArrayList<Student> ls = new ArrayList<>();
        ls.add(new Student());
        ls.add(new Student("Nguyễn Hoàng Hiêp","10/4/2004","Hà Nội","T2207A",10));

        //In thông tin sinh viên 1
        ls.get(1).getTen();
        ls.get(1).getNgaySinh();
        ls.get(1).getDiaChi();
        ls.get(1).getTenLopHoc();
        ls.get(1).getDiemTrungBinh();

        ArrayList<String> strs = new ArrayList<>();

//        ArrayList<Integer>
    }
    // Tạo một lớp Cả gồm: brand, name, price
    // Tạo 1 Arraylist Car, sau đó sắp xếp theo giá trị tăng dần
}
