package week6.inheritance2;

/**
 * This is parent class.
 */
public class Bag {
    private int volume;
    private String material;
    private String color;

    private boolean isFull;
    private int contain;

    public Bag(){
        isFull = false;
        contain = 0;
    }

    public int getVolume() {
        return volume;
    }

    public String getMaterial() {
        return material;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    public boolean isFull() {
//        return isFull;
//    }
//
//    public void setFull(boolean full) {
//        isFull = full;
//    }
//
//    public int getContain() {
//        return contain;
//    }
//
//    public void setContain(int contain) {
//        this.contain = contain;
//    }

    public void add(int in){
        if(volume >= contain + in){
            contain += in;
            System.out.println(in + " added to the bag, now it contains " + contain);
        }else{
            System.out.println("Sorry but bag doesn't have enough space ( "+contain+" / "+volume + " ) ");
        }

        if(volume == contain){
            isFull = true;
        }
    }

    public void remove(int out){
        if( contain - out >= 0 ){
            contain -= out;
            System.out.println(out + " removed from the bag, now it contains " + contain);
        }else{
            System.out.println("Sorry but bag doesn't have enough items ( "+contain+" / "+volume + " ) ");
        }

        if(contain != volume){
            isFull = false;
        }
    }
// The last display method just shows what we have in the bag.
    public void display(){
        System.out.print("This bag has a volume of " +volume+ " ml. ");
        System.out.print("It is " +color+ " in color, made of " + material + ". ");
        System.out.print("It has  " +contain+ " ml. of items in it. ");
        if(isFull){
            System.out.println("It is full now. ");
        }else{
            System.out.println("It is not yet full. ");
        }
    }
}
