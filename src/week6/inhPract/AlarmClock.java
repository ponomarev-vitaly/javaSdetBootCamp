package week6.inhPract;

public class AlarmClock extends Clock{
    private String alarm;
    public void setAlarm(String newAlarm){
        if(alarm != null){
            System.out.println("Alarm changed from "+alarm+" to "+newAlarm+". ");
        }else{
            System.out.println("Alarm set to " + newAlarm+". ");
        }
        alarm = newAlarm;
    }
    public void removeAlarm(){
        alarm = null;
    }
    public void acDetail(){
        if(alarm != null){
            System.out.println("Alarm was set to "+alarm+". ");
        }else{
            alarm = null;
        }
    }
}
