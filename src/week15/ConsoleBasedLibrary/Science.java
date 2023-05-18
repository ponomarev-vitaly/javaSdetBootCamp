package week15.ConsoleBasedLibrary;

public class Science extends Library implements ScientificData{
    private String type;
    private boolean isArticle;

    public Science(String myBooksBusiness, String author, int numberOfPages, String theDateOfIssue, String type, boolean isArticle) {
        super(myBooksBusiness, author, numberOfPages, theDateOfIssue);
        this.type = type;
        this.isArticle = isArticle;
    }

    @Override
    public void addBook(Science scientificDataBook) {
        throw new UnsupportedOperationException("This operation is not supported at the moment!");
    }

    @Override
    public void deleteBook(Science scientificDataBook) {
        throw new UnsupportedOperationException("This operation is not supported at the moment!");
    }

    @Override
    public void buyBook(Science scientificDataBook) {
        throw new UnsupportedOperationException("This operation is not supported at the moment!");
    }

    @Override
    public void giveBackBook(Science scientificDataBook) {
        throw new UnsupportedOperationException("This operation is not supported at the moment!");
    }
}
