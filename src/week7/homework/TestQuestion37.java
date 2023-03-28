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
                // count++; // Delete unreachable statement! In that case count++ is inside the SCOPE, foreach loop won't reach it.
            }

        }
        System.out.println(count + " Found");
    }
}
