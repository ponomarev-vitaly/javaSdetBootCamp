package week9.SchoolManagement;

import java.util.ArrayList;
import java.util.List;

public interface SchoolManagement {
    void create();
    void subMenu();
    void search();
    void list();

    void exit();
    void delete();

    List<Person> teachers = new ArrayList<>(); // This ArrayList is created to store teachers objects.
    List<Person> student = new ArrayList<>(); // This ArrayList is created to store students objects.
}
