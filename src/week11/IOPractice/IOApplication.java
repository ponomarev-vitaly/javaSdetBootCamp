package week11.IOPractice;

public class IOApplication {
    public static void main(String[] args) {

        // Change false to true and back gives an opportunity to create the user or the manager.
        User test1 = new User("test1", "test", "one", 123123, false);
        User test2 = new User("test2", "test", "one", 456456, true);
        User test3 = new User("test3", "test", "one", 123456, false);
        User test4 = new User("test4", "test", "one", 555333, true);
        User test5 = new User("test5", "test", "one", 777777, false);

    }
}
