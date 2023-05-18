package week15.ConsoleBasedLibrary;

public class Library {
    private static int IDCounter=0;
    private int ID;
    private String myBooksBusiness;
    private String author;
    private int numberOfPages;
    private String theDateOfIssue;

    public Library(String myBooksBusiness, String author, int numberOfPages, String theDateOfIssue) {
        this.myBooksBusiness = myBooksBusiness;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.theDateOfIssue = theDateOfIssue;
        IDCounter++;
        this.ID = IDCounter;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMyBooksBusiness() {
        return myBooksBusiness;
    }

    public void setMyBooksBusiness(String myBooksBusiness) {
        this.myBooksBusiness = myBooksBusiness;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getTheDateOfIssue() {
        return theDateOfIssue;
    }

    public void setTheDateOfIssue(String theDateOfIssue) {
        this.theDateOfIssue = theDateOfIssue;
    }

    public String gettingData(String bookInfo){
        return bookInfo;
    }
}
