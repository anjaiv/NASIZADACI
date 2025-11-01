public class Book extends Media{
    private int numPages;

    public Book(String author, String title, int numPages) {
        super(author, title);
        this.numPages = numPages;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Number of pages: "+numPages);
    }
    public void bookSample(){
        System.out.println("Book is available for reading");

    }
}
