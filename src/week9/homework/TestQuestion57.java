package week9.homework;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Java certification test. Question number 57.
 */
public class TestQuestion57 {
    public static class Person {
        String name;
        int age;

        public Person (String n, int a){
            name = n;
            age = a;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static void checkAge(List<Person>list, Predicate<Person> predicate) {
        for (Person p : list){
            if (predicate.test(p)) {
                System.out.println(p.name + " ");
            }
        }
    }

    public static void main(String[] args) {
        List<Person> iList = Arrays.asList(new Person("Hank", 45),
                new Person("Charlie", 40),
                new Person("Smith", 38));
        checkAge(iList, p -> p.getAge ( ) > 40); // Discuss that with the mentor.
    }
}
