package week6.inheritance2;

public class BagApp {
    public static void main(String[] args) {
        BackPack sb01 = new BackPack();

        // sb01.setCompany("ACME");
        sb01.setColor("Red and White");
        sb01.setMaterial("plastic");
        sb01.setVolume(1500);

        sb01.display();
        // sb01.details();

        sb01.add(750);
        sb01.add(500);
        sb01.add(250);

        sb01.display();
        sb01.remove(1250);
        sb01.display();
    }
}
