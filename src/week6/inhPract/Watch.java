package week6.inhPract;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Watch extends Clock{

    private String strMaterial;
    private String strColor;
    private boolean light = false;

    public String getStrMaterial() {
        return strMaterial;
    }

    public void setStrMaterial(String strMaterial) {
        this.strMaterial = strMaterial;
    }

    public String getStrColor() {
        return strColor;
    }

    public void setStrColor(String strColor) {
        this.strColor = strColor;
    }

//    public boolean isLight() {
//        return light;
//    }
//
//    public void setLight(boolean light) {
//        this.light = light;
//    }

    public void showDate(){
        SimpleDateFormat sdt = new SimpleDateFormat("dd");
        System.out.println("The day is \"" +sdt.format(new Date())+ "\"");
    }

    public void lightOnOff(){
        // light = light ? false : true;
        light = !light;
        if(light){
            System.out.println("Now the light is ON.");
        }else{
            System.out.println("Now the light is OFF.");
        }
    }

    public void watchDetails(){
        System.out.println("This clock has " + strColor + " color strap made of " +
                strMaterial + ". Currently the light is " + (light ? "ON." : "OFF."));
    }
}
