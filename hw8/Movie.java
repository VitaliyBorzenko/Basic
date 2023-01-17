public class Movie {
    String title;
    String studio;
    String rating;

    public Movie(String title, String studio,String rating){
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio){
            this.title = title;
            this.studio = studio;
            this.rating = "PG";

    }
    public String toString(){
        return String.format("Название: %s, Студия: %s, Рейтинг: %s",title,studio,rating);
    }
}
