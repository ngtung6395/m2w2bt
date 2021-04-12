package nhanvien;

public class NhanVienParttime extends Nhanvien{
    private double hours;

    public NhanVienParttime(String employCode, String name, String email, int age, int phone, double hours) {
        super(employCode, name, email, age, phone);
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    @Override
    public double getSalaryEmploy(){
        return getHours()*100000;
    }

    @Override
    public String toString() {
        return "NhanVienParttime{" +
                "emloycode=" + getEmployCode() +
                ", name=" + getName() +
                ", age=" + getAge() +
                ", phone number=" + getPhone() +
                ", email=" + getEmail() +
                ", hours=" + hours +
                '}';
    }
}
