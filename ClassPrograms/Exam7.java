
public class Exam7 {
    public static void main(String[] args) {
        Television sony=new Television(345.7f,(byte)15,(byte)3,(byte)5,(byte)8);
        Remote remote=new Remote(sony);
           remote.power_On();
           remote.change_Channel((byte)5);
           remote.volume_Up((byte) 3);
          remote.volume_Down((byte)1);
          remote.power_Off();
    }
}

class Television{
    private byte volume=5;
       private byte no_of_channels;
       private byte usb_ports;
       private byte hdmi_Ports;
       private byte resolution;
       private float size ;
       Television(float size,byte ...var){
       no_of_channels=var[0];
       usb_ports=var[1];
       hdmi_Ports=var[2];
       resolution=var[3];
       this.size=size;

       }
     public void switch_on(){

         System.out.println("Switch on.");
     }

    public void power_On(){
        System.out.println("Television: Screen displayed");


    } public void power_Off(){
        System.out.println("Television: Screen Shutoff");

    } public void change_Channel(byte channel_no){

        System.out.println("Television: Watching Channel "+channel_no);

    } public void volume_Up(byte vol){
        volume+=vol;
        System.out.println("Volume up "+volume);

    } public void volume_Down(byte vol){

        volume-=vol;
        System.out.println("Volume down "+volume);


    } public void Change_Setting(){

        System.out.println("Setting console displayed!");

    }








}
class Remote{

   private Television sony;
   Remote(Television sony){
       this.sony=sony;
   }
    public void power_On(){
        System.out.println("Remote: power on");
       sony.power_On();
    } public void power_Off(){
        System.out.println("Remote: power off");

       sony.power_Off();

    } public void change_Channel(byte channel_no){
        System.out.println("Remote: Change Channel to "+channel_no);
  sony.change_Channel(channel_no);

    } public void volume_Up(byte vol){

        System.out.println("Remote: volume up");
        sony.volume_Up(vol);

    } public void volume_Down(byte vol){
        System.out.println("Remote: volume down");
        sony.volume_Down(vol);


    } public void Change_Setting() {

        sony.Change_Setting();

    }
}




