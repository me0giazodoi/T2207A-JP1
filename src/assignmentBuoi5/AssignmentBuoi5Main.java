package assignmentBuoi5;

public class AssignmentBuoi5Main {
    public static void main(String[] agrs){
        Student[] students = new Student[10];
        for(int i=0;i< students.length;i++) {
            students[0] = new Student("Nguyễn Văn A", "1/1/2004", "Hà Nội", "9A5", 10);
            students[1] = new Student("Nguyễn Văn B", "1/2/2004", "Hải Dương", "8A5", 9);
            students[2] = new Student("Nguyễn Văn C", "1/3/2004", "Hải Phòng", "7A5", 3);
            students[3] = new Student("Nguyễn Văn D", "1/4/2004", "TP Hồ Chí Minh", "6A5", 8);
            students[4] = new Student("Nguyễn Văn E", "1/5/2004", "Phú Thọ", "5A5", 5);
            students[5] = new Student("Nguyễn Văn F", "1/6/2004", "Lạng Sơn", "4A5", 8);
            students[6] = new Student("Nguyễn Văn G", "1/7/2004", "Ba Vì", "3A5", 4);
            students[7] = new Student("Nguyễn Văn H", "1/8/2004", "Quảng Ninh", "2A5", 7);
            students[8] = new Student("Nguyễn Văn I", "1/9/2004", "Thanh Hóa", "1A5", 8);
            students[9] = new Student("Nguyễn Văn K", "1/10/2004", "Quảng Châu", "10A5", 9);
            System.out.println(students[i].getTen());
            System.out.println(students[i].getNgaySinh());
            System.out.println(students[i].getDiaChi());
            System.out.println(students[i].getTenLopHoc());
            System.out.println(students[i].getDiemTrungBinh());
        }
    }
}
