package week10;

/**
 * The program gives an example that uses the methods in Throwable to display exception information.
 * Line 4 invokes the sum method to return the sum of all the elements in the array.
 * There is an error that causes the ArrayIndexOutOfBoundsException, a subclass of IndexOutOfBoundsException.
 * This exception is caught in the try-catch block. The stack trace, exception message,
 * and exception object and message using the printStackTrace(), getMessage(), and toString() methods.
 * Each element represents a method call. You can obtain the method, class name, and exception for each element.
 * Can use the printStackTrace(), getMessage(), toString(), and getStackTrace() methods to obtain information from exception objects.
 */
public class TestException {
    public static void main(String[] args) {
        try{
            System.out.println(sum(new int[]{1,2,3,4,5}));
        }
        catch(Exception ex){
            ex.printStackTrace(); // Discuss.
            System.out.println("\n"+ex.getMessage());
            System.out.println("\n"+ex.toString());

            System.out.println("\nTrace Info Obtained from getStackTrace");
            StackTraceElement[] traceElements = ex.getStackTrace();
            for (int i = 0; i < traceElements.length; i++) {
                System.out.println("method" + traceElements[i].getMethodName());
                System.out.println("("+traceElements[i].getClassName()+":");
                System.out.println(traceElements[i].getLineNumber()+")");
            }
        }
    }

    private static int sum(int[] list){
        int result = 0;
        for (int i = 0; i <= list.length ; i++) {
            result+=list[i];
        }
        return result;
    }
}
