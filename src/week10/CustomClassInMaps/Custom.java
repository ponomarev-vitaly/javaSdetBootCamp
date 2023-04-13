package week10.CustomClassInMaps;

public class Custom implements Comparable{

    private int ID;
    private String name;

    public Custom(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String toString() {
        return " (" + ID + ") " + name;
    }

    @Override
    public int compareTo(Object o) {
        Custom other = (Custom) o;
        return Integer.compare(this.ID, other.ID) != 0 ? Integer.compare(this.ID, other.ID) : this.name.compareTo(other.name);
    }
}
