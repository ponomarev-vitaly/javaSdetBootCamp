package week6.inhPract;

public class DigitalWatch extends Watch{
    private String alarm;
    private int brightness = 50;

    public void brightnessUp(){
        if(brightness < 100){
            System.out.println("The brightness changed from "+brightness+" to "+(brightness+25)+".");
            brightness += 25;
        }else{
            System.out.println("The brightness is already at MAX.");
        }
    }

    public void brightnessDown(){
        if(brightness > 0){
            System.out.println("The brightness changed from "+brightness+" to "+(brightness-25)+".");
            brightness -= 25;
        }else{
            System.out.println("The brightness is already at MINIMUM.");
        }
    }

    public void setAlarm(String newAlarm){
        if(alarm != null){
            System.out.println("Alarm changed from " + alarm + " to " + newAlarm + ". ");
        }else{
            System.out.println("Alarm set to " + newAlarm + ". ");
        }
        alarm = newAlarm;
    }

    public void removeAlarm(){
        alarm = null;
    }

    public void dwDetail(){
        System.out.print("Now the brightness is at %" + brightness + ". ");
        if(alarm != null){
            System.out.println("Alarm was set to "+alarm+". ");
        }else{
            System.out.println("There is no alarm was set.");
        }
    }
}
