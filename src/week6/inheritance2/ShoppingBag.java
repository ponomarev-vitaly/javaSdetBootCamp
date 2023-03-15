package week6.inheritance2;

public class ShoppingBag extends Bag{
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void details(){
        System.out.println("This shopping bag was produced for \"" + company + "\". ");
    }
}
