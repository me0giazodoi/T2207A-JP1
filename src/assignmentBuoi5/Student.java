package assignmentBuoi5;

public class Student {
    private String ten;
    private String ngaySinh;
    private String diaChi;
    private String tenLopHoc;
    private double diemTrungBinh;
    public Student() {
    }

    public Student(String ten, String ngaySinh, String diaChi, String tenLopHoc, double diemTrungBinh){
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.tenLopHoc = tenLopHoc;
        this.diemTrungBinh = diemTrungBinh;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getTenLopHoc() {
        return tenLopHoc;
    }
    public void setTenLopHoc(String tenLopHoc) {
        this.tenLopHoc = tenLopHoc;
    }
    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }
    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
    public char[] baoCaoKetQua() {
        if (this.diemTrungBinh < 4) {
            System.out.println("Học sinh yếu");
        } else {
            if (this.diemTrungBinh<6.5) {
                System.out.println("Học sinh trung bình");
            } else {
                if (this.diemTrungBinh < 8) {
                    System.out.println("Học sinh khá");
                } else {
                    if (this.diemTrungBinh < 9.5) {
                        System.out.println("Học sinh giỏi");
                    }else {
                        System.out.println("Học sinh Xuất sắc");
                    }
                }
            }
        }
        return new char[0];
    }
}
