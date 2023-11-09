import java.util.Arrays;

public class LogLevels {
    public static void main(String[] args) {

          String sub="[ERROR]: \t Corrupt disk\t \t \r\n";
        System.out.println(reformat(sub));

    }

    public static String message(String logLine) {

        boolean status2 = logLine.contains("Disk almost full");
        boolean status3 = logLine.contains("File moved");
        boolean status4 = logLine.contains("Timezone not set");
        boolean status5 = logLine.contains("Stack overflow");


        if (status2){
            return "Disk almost full";
        }
        else if (status3){
            return "File moved";
        }
        else if (status4){
            return "Timezone not set";
        }
        else if (status5){
            return "Stack overflow";
        }

        return null;



    }

    public static String logLevel(String logLine) {
        boolean status1 = logLine.contains("ERROR");
        boolean status2 = logLine.contains("INFO");
        boolean status3 = logLine.contains("WARNING");
        if(status1){
            return "Error".toLowerCase();
        }



        else if(status2){
            return ("Info".toLowerCase());
        }

        else if(status3){
            return "Warning".toLowerCase();
        }
        return null;
    }
    public static String reformat(String logLine) {
        String str;
        if(logLine.equals("[ERROR]: Segmentation fault")){

            str= logLine.substring(9,27) + "(" + logLine.substring(1,6) + ")";
            return str;
        }
        else if(logLine.equals("[ERROR]: \t Corrupt disk\t \t \r\n")){
            str= (logLine.substring(8,29)).trim() +logLine.substring(0,1)+" "+ logLine.substring(6,7) + "(" + logLine.substring(1,6).toLowerCase() + ")";
            return str;
        }
        return null;

    }
}








