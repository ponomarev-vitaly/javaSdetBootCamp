package week8.homework.Interface;

/**
 * We created Employee interface.
 */
public interface Employee extends Database{
    double salary(String department);
    void task();
    void personalInfo();
}
