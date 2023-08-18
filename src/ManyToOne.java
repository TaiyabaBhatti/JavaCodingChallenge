public class ManyToOne {
    public static void main(String[] args) {

       University university=new University("Helsinki","Tehnillinen korkeakoulu");
        StudentMany s1=new StudentMany("Peeka Lundmark","Master of Science",university);

        System.out.println(s1.getUniversity().getName());
        System.out.println(s1.getDept_Name());







    }
}





class StudentMany{

    private String name;
    private String dept_Name;
    private University university;

    StudentMany(String name, String dept_Name, University university){
        this.name=name;
        this.dept_Name=dept_Name;
        this.university=university;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept_Name() {
        return dept_Name;
    }

    public void setDept_Name(String dept_Name) {
        this.dept_Name = dept_Name;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

}

class University{

    private String name;
    private String location;

    University(String name, String location){
        this.name=name;
        this.location=location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
