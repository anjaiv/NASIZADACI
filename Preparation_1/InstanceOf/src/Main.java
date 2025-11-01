import java.util.Scanner;

public class Main{

    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);

        String media_author;
        String media_title;
        String bookTitle;
        String bookAuthor;
        int numPages;
        String movieTitle;
        String movieAuthor;
        double duration;
        System.out.println("Enter base media title: ");
        media_title = scanner.nextLine();
        System.out.println("Enter base media author: ");
        media_author = scanner.nextLine();
        System.out.println("Enter book title: ");
        bookTitle=scanner.nextLine();
        System.out.println("Enter book author: ");
        bookAuthor=scanner.nextLine();
        System.out.println("Enter number of pages: ");
        numPages=scanner.nextInt();
        System.out.println("Enter movie title: ");
        movieTitle=scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter movie author: ");
        movieAuthor=scanner.nextLine();
        System.out.println("Enter duration: ");
        duration=scanner.nextDouble();
        scanner.nextLine();
        Media[] media={new Media(media_author,media_title),new Book(bookAuthor,bookTitle,numPages), new Movie(movieAuthor,movieTitle,duration)};
        for (int i=0;i< media.length;i++){
            media[i].display();
            if(media[i] instanceof Book b){
                b.bookSample();
            }
            else if(media[i] instanceof Movie m){
                m.movieSample();
            }
        }



    }
}