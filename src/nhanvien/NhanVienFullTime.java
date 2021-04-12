package nhanvien;

public class NhanVienFullTime extends Nhanvien{
    private double salary, commission, penalty;

    public NhanVienFullTime(String employCode, String name, String email, int age, int phone, double salary, double commission, double penalty) {
        super(employCode, name, email, age, phone);
        this.salary = salary;
        this.commission = commission;
        this.penalty = penalty;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }
    @Override
    public double getSalaryEmploy(){
        return salary + commission - penalty;
    }

    @Override
    public String toString() {
        return "NhanVienFullTime{" +
                "emloycode=" + getEmployCode() +
                ", name=" + getName() +
                ", age=" + getAge() +
                ", phone number=" + getPhone() +
                ", email=" + getEmail() +
                ", salary=" + salary +
                ", commission=" + commission +
                ", penalty=" + penalty +
                '}';
    }
}
