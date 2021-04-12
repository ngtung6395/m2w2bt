package nhanvien;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Nhanvien> employs;

    public Manager(){
        this.employs = new ArrayList<>();
    }

    public  void addEmploy(Nhanvien employ){
        this.employs.add(employ);
    }
    public void display(){
        for (Nhanvien o: employs
             ) {
            System.out.println(o.toString());
        }
    }
    public double salaryEmployParttime(){
        double total = 0;
        for (Nhanvien o: employs
             ) {
            if(o instanceof NhanVienParttime){
                total += o.getSalaryEmploy();
            }
        }
        return total;
    }
}
