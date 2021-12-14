public class Movies {
    String title;
    String director;
    String composer;

    public Movies(String title, String director, String composer) {
        this.title = title;
        this.director = director;
        this.composer = composer;
    }

    public static Movies off(String title, String director, String composer) {
        return new Movies(title, director, composer);
    }
}