package week5.homework;

/**
 * Question 13. Java certification. Given the code and given the code fragment. Result? 20:20
 */
public class TestQuestion13 {
    public static void main(String[] args) {

        class Vehicle {
            int x;

            Vehicle() {
                this(10); // line n1
            }

            Vehicle(int x) {
                this.x = x;
            }
        }

        class Car extends Vehicle {
            int y;

            Car() {
                super(10); // line n2
            }

            Car(int y) {
                super(y); // What super does?
                this.y = y;
            }

            public String toString() {
                return super.x + ":" + this.y; // What is going on in this line of code?
            }

        }

        Vehicle y = new Car(20);
        System.out.println(y);
    }
}
