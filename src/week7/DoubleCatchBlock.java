package week7;

public class DoubleCatchBlock {
    // Create an array.
    public int[] arr = new int[10];
    // Create try catch block.
    public void writeList(){
        try{
            arr[10]=11; // We get this result in the console: IndexOutOfBoundsException => Index 10 out of bounds for length 10.
        }
//        catch (NumberFormatException eNF){
//            System.out.println("NumberFormatException => " + eNF.getMessage());
//        }
//        catch (IndexOutOfBoundsException eIOB){
//            System.out.println("IndexOutOfBoundsException => " + eIOB.getMessage());
//        }
        // Create a short form for the catch block exceptions.
        catch(NumberFormatException | IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create an object.
        DoubleCatchBlock obj = new DoubleCatchBlock();
        // Call the method on the object.
        obj.writeList();
    }
}
