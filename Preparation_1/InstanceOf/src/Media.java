public class Media {
    protected String title;
    protected String author;

    public Media(String author,String title) {
        this.author = author;
        this.title = title;
    }

    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);

    }
}
