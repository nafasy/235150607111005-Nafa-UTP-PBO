public class Movie{
    private String title;
    private double rating;
    private String[] genres;

    public Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public Movie(String title, double rating, String[] genres) {
        this.title = title;
        this.rating = rating;
        this.genres = genres;
    }

    public String getTitle(){
        return this.title;
    }

    public double getRating(){
        return this.rating;
    }

    public String[] getGenres(){
        return this.genres;
    }

    public void setGenres(String[] genres){
        this.genres = genres;
    }

}