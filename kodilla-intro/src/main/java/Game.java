public class Game {
    String title;
    String gameGenre;
    int publicationDate;

    public Game(String title, String gameGenre, int publicationDate) {
        this.title = title;
        this.gameGenre = gameGenre;
        this.publicationDate = publicationDate;
    }

    public static Game off(String title, String gameGenre, int publicationDate) {
        return new Game(title,gameGenre,publicationDate);
    }
}