package week11;

public class TestQuestion74 {
    void readCard(int cardNo) throws Exception { // code in line n2 not gonna run because of the "throws Exception"
        System.out.println("Reading Card");
    }

    void checkCard(int cardNo) throws RuntimeException { // line n1
        System.out.println("Checking card");
    }

    public static void main(String[] args) {
        TestQuestion74 ex = new TestQuestion74();
        int cardNo = 12344;
        // ex.readCard(cardNo); //line n2
        ex.checkCard(cardNo); //line n3
    }
}
