public class Exam14 {
    public static void main(String[] args) {

        AC hair=new AC("Hair",2.5f);
        AcRemote remote=new AcRemote(hair);
        remote.power_On();
        remote.wings_stop();
        remote.increase_degree((byte)3);

    }
}

class AC{
    private String Company_name;
    private float tons;
    private byte def_degree;
    private boolean wings_swing;

    AC(String company_name,float tons){
        this.Company_name=company_name;
        this.tons=tons;
        this.def_degree=16;
    }
    public void power_On(){
        System.out.println("***** Power on ******");
        System.out.println("Default Degree: "+def_degree);
        wings_swing=true;
    }

    public void increase_degree(byte degree){
           def_degree+=degree;
        System.out.println("Increased degree to "+def_degree);
    }
    public void decreased_degree(byte degree){
           def_degree-=degree;
        System.out.println("Decreased degree to "+def_degree);
    }
    public void wings_stop(){
    if (wings_swing){
    wings_swing=false;
        System.out.println("Wings has stoped!!");
    }
    else {
        System.out.println("Wings already stoped!!");
    }

    }





}
class AcRemote{

    private AC hair;
    AcRemote(AC hair){
        this.hair=hair;
    }
     public void power_On(){
     hair.power_On();
     }
      public void increase_degree(byte degree){
          hair.increase_degree(degree);

      }
      public void decrease_degree(byte degree){
          hair.increase_degree(degree);

      }
         public void wings_stop(){

           hair.wings_stop();

         }







}
