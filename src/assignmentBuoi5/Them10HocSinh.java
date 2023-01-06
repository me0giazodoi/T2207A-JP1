package assignmentBuoi5;

import java.util.*;

public class Them10HocSinh {
    public static void main(String[] args){
//        Student[] hs = new Student[10];
        ArrayList<Student> hs = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<10;i++){
            System.out.println("Nhập tên: ");
            String ten = sc.nextLine();
            System.out.println("Nhập ngày sinh: ");
            String ns = sc.nextLine();
            System.out.println("Nhập địa chỉ: ");
            String dc = sc.nextLine();
            System.out.println("Nhập lớp học: ");
            String lh = sc.nextLine();
            System.out.println("Nhập điểm trung bình: ");
            Double tb = sc.nextDouble();
            hs.add(new Student(ten,ns,dc,lh,tb));
        }
//        for (int i=0;i<hs.length-1;i++){
//            for (int j=0;j<hs.length-i-1;j++){
//                if (hs[j].getDiemTrungBinh() < hs[j+1].getDiemTrungBinh()){
//                    Student tmp;
//                    tmp = hs[j];
//                    hs[j] =  hs[j+1];
//                    hs[j+1] = tmp;
//                }
//            }
//        }
//        for (int i=0;i< hs.length;i++){
//            hs[i].getTen();
//            hs[i].getNgaySinh();
//            hs[i].getDiaChi();
//            hs[i].getTenLopHoc();
//            hs[i].getDiemTrungBinh();
//        }
//        for (int i=0;i< hs.length;i++){
//            if (hs[i].getDiemTrungBinh() >= 9.5){
//                System.out.println(hs[i].getTen());
//                System.out.println(hs[i].getNgaySinh());
//                System.out.println(hs[i].getDiaChi());
//                System.out.println(hs[i].getTenLopHoc());
//                System.out.println(hs[i].getDiemTrungBinh());
//            }
//        }
        Collections.sort(hs, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getDiemTrungBinh() - o2.getDiemTrungBinh()>0? 0:-1;
            }
        });
    }
}
