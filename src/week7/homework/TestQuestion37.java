package week7.homework;

/**
 *Question N 37 for the Java certification.
 */
public class TestQuestion37 {
    public static void main(String[] args) {
        int data[]={2010,2013,2014,2015,2014};
        int key = 2014;
        int count = 0;
        for(int e: data){
            if(e != key){
                continue;
                // count++; // Delete unreachable stateent!
            }
        }
        System.out.println(count + " Found");
    }
}
