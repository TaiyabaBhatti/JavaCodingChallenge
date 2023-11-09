import java.util.ArrayList;

public class Exam6 {
    public static void main(String[] args) {

        String[] array={"MUET","KU","LUMS"};
        int[] array2={12,405,56};
        SystemUni HEC=new SystemUni("HEC",array,array2);
        HEC.display();
        HEC.removeUni("KU");
        HEC.display();
        HEC.addUni("Bilawal University",34);
        HEC.display();
    }
}
class SystemUni {
    private String sysName;
    private ArrayList<University2> list = new ArrayList<>();

    SystemUni(String sysName, String[] uniName, int[] uniCode) {
        this.sysName = sysName;
        for (int i = 0; i < uniName.length; i++) {

            list.add(new University2(uniName[i],uniCode[i]));
        }

    }
    public String sysName() {
        return sysName;
    }

    public void removeUni(String uniName) {

        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).getName()).equals(uniName)) {

                list.remove(i);
                System.out.println("Successfully removed");
                break;
            }

        }


    }
    public void addUni(String uniName,int uniCode){
        System.out.println("Recently added ");
        list.add(new University2(uniName,uniCode));

    }


    public void display(){
        System.out.println("Displayed all the contents");
        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i).getName()+" "+list.get(i).getCode());

        }



    }
}
    class University2 {
        private String uniName;
        private int uniCode;
        University2(String uniName,int uniCode) {
            this.uniName = uniName;
            this.uniCode=uniCode;
        }
        public String getName() {
            return uniName;
        }
        public int getCode(){
            return uniCode;
        }
    }