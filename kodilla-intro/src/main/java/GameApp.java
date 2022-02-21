public class GameApp {
    public static void main(String[] args) {
        Game Gothic = Game.off("Gothic","cRPG",2001);
        System.out.println(Gothic.title + " " + Gothic.gameGenre + " " + Gothic.publicationDate);


        Game Warcraft = Game.off("Warcraft III", "RTS", 2002);
        System.out.println(Warcraft.title + " " + Warcraft.gameGenre + " " + Warcraft.publicationDate);

        Game Cyberpunk = Game.off("Cyberpunk", "RPG", 2021);
        System.out.println(Cyberpunk.title + " " + Cyberpunk.gameGenre + " " + Cyberpunk.publicationDate);
    }
}