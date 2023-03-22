package week7.Question6;
class C{
    public void create(){
        System.out.print("c");
    }
}
class U{
    private void update(){
        System.out.print("u");
    }
}
class R extends C{
    public void create() {
        System.out.print("C");
    }
    protected void read(){
        System.out.print("R");
    }
}
class D extends U{
    void update(){
        System.out.print("U");
    }
    void delete(){
        System.out.print("D");
    }
}
public class CURD {
    public static void main(String[] args) {
        new C().create();
        new D().update();
        new R().read();
        new D().delete();
    }
}
