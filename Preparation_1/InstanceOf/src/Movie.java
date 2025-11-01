public class Movie extends Media{
    private double duration;

    public Movie(String author, String title, double duration) {
        super(author, title);
        this.duration = duration;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Duration of movie: "+duration);
    }
    public void movieSample(){
        System.out.println("A movie is available for watching");
    }

}
