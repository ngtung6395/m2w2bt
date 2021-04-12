package nhanvien;

public class Nhanvien {
    private String employCode, name, email;
    private  int age, phone;

    public Nhanvien(String employCode, String name, String email, int age, int phone) {
        this.employCode = employCode;
        this.name = name;
        this.email = email;
        this.age = age;
        this.phone = phone;
    }

    public String getEmployCode() {
        return employCode;
    }

    public void setEmployCode(String employCode) {
        this.employCode = employCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    public double getSalaryEmploy(){
        double total = 0;
        return  total;
    }
}
