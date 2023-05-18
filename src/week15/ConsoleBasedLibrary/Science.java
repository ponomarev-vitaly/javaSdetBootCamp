package week15.ConsoleBasedLibrary;

public class Science extends Library implements ScientificData{

    public Science(String myBooksBusiness, String author, int numberOfPages, String theDateOfIssue) {
        super(myBooksBusiness, author, numberOfPages, theDateOfIssue);
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
