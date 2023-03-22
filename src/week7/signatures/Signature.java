package week7.signatures;

public class Signature {
    public int add(String a, int b){ // Pay attention to: return type, name of the method, parameter list.
        return 0;
    }

    public int add(int b){ // Parameter lists are different, these methods are different.
        return 1;
    }

    public int add(int b, String a){ // Parameters were swapped and that is why these methods are different.
        return 2;
    }

    public int add2(String c, int d){ // THe 4th and the 1st methods have exact duplicates, this is not acceptable to run an application.
        // The solution is to change the name of the method from add to add2.
        // Java cares about types of the variables!!!
        return 3;
    }

    public static void main(String[] args) {

    }
}
