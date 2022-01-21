package movies;

public class Movie {
    private String movieTitle;
    private String movieCategory;

    public Movie(String movieTitle, String movieCategory) {
        this.movieTitle= movieTitle;
        this.movieCategory=movieCategory;

    }

    public String getName() {
        return movieTitle;
    }

    public String getCategory() {
        return movieCategory;
    }
}
