package nhanvien;

public class Main {
    public static void main(String[] args) {
        Manager tung = new Manager();
        Nhanvien a = new NhanVienFullTime("01","Nguyễn Văn A","A@gmail.com",
                26,0123456,5000000,2000000,70000);
        Nhanvien b = new NhanVienParttime("01","Trần văn B","B@gmail.com",
                21,07654,72);
        Nhanvien c = new NhanVienParttime("02","Lê Hoàng C","C@gmail.com",
                22,03457,64);

        tung.addEmploy(a);
        tung.addEmploy(b);
        tung.addEmploy(c);
        tung.display();
        tung.salaryEmployParttime();
    }
}
