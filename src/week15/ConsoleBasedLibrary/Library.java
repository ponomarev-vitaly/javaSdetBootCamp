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
    }
}
