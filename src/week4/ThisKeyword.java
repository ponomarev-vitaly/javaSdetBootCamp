package week4;

public class ThisKeyword {
    String name;

        // setter method
        void setname(String name){
            this.name = name;
        }
        // getter method
        String getName(){
            return this.name;
        };

    public static void main(String[] args){
        ThisKeyword obj = new ThisKeyword();

        // calling the getter and setter method
        obj.setname("Adam");
        System.out.println("Obj.name: " + obj.getName());
    }
}
