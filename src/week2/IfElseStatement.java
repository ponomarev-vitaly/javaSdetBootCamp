package week2;

public class IfElseStatement {
    public static void main(String[] args) {
        int number = -1;
        if(number > 0){
            System.out.println("The number is positive.");
        }
        else{
            System.out.println("The number is not positive.");
        }

        String weather = "rain";
        if(weather == "rain"){
            System.out.println("I will go to the mall");

        }else{
            System.out.println("I will go to the picnic");
        }
        if(weather.isEmpty()){
            System.out.println("I will contact with my parent");
        }else{
            System.out.println("I will make the plan accordingly...");
        }

        System.out.println("This code line is always executed.");
    }
}
