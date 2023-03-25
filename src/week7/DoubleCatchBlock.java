package week7;

public class DoubleCatchBlock {
    // Create an array.
    public int[] arr = new int[10];
    // Create try catch block.
    public void writeList(){
        try{
            arr[10]=11;
        } catch (NumberFormatException eNF){
            System.out.println("NumberFormatException => " + eNF.getMessage());
        }
        catch (IndexOutOfBoundsException eIOB){
            System.out.println("IndexOutOfBoundsException => " + eIOB.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create an object.
        DoubleCatchBlock obj = new DoubleCatchBlock();
        // Call the method on the object.
        obj.writeList();
    }
}
