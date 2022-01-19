public class MoviesApp {
    public static void main(String[] args) {
        Movies movies = Movies.off("Godfather", "Francis Ford Copolla", "Nino Rota");
        System.out.println(movies.title + " " + movies.director + " " + movies.composer);
    }
}