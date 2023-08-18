import java.time.Period;

import java.time.LocalDate;
import java.util.ArrayList;

public class OneToMany {
    public static void main(String[] args) {

        Doctors d1=new Doctors("Anis Hussain",(byte)13,LocalDate.parse("2007-05-10"));
        Doctors d2=new Doctors("Maaz Bhatti",(byte)16,LocalDate.parse("2019-12-05"));

        Hospital aku=new Hospital("Agha Khan Hospital");
        aku.addDoctors(d1);
        aku.addDoctors(d2);

        ArrayList<Doctors> doctors=aku.getDoctors();
        for (Doctors element:doctors) {
            System.out.println(element.getName()+" "+element.getGrade()+" "+ element.servingYears());
        }



    }
}


class Hospital{

    private String name;
    private ArrayList<Doctors> doctors;
    Hospital(String name){
        this.name=name;
        this.doctors=new ArrayList<>();

    }

    public ArrayList<Doctors> getDoctors() {
        return doctors;
    }

    public void addDoctors(Doctors doctors) {
        this.doctors.add(doctors);
    }
}

class Doctors{

    private String name;
    private byte grade;
    private LocalDate hire_date;

    Doctors(String name, byte grade, LocalDate hire_date){
        this.name=name;
        this.grade=grade;
        this.hire_date=hire_date;
    }
    public int servingYears(){
        Period period=Period.between(hire_date,LocalDate.now());
        return period.getYears();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(byte grade) {
        this.grade = grade;
    }

    public void setHire_date(LocalDate hire_date) {
        this.hire_date = hire_date;
    }

    public String getName() {
        return name;
    }

    public byte getGrade() {
        return grade;
    }

    public LocalDate getHire_date() {
        return hire_date;
    }

}
