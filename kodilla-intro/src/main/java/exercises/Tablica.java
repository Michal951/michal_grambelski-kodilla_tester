package exercises;

public class Tablica {
    public static void main(String[] args) {
        String[] hamiltonSongs = new String[5];
        hamiltonSongs[0] = "My shot";
        hamiltonSongs[1] = "Wait for it";
        hamiltonSongs[2] = "Yorktown";
        hamiltonSongs[3] = "Story of Tonight";
        hamiltonSongs[4] = "Who lives, who dies who tells your story";

        String[] games = new String[]{"Gothic", "Warcraft", "Fable"};

        int numberOfElemets = hamiltonSongs.length;
        System.out.println("Moja tablica ma " + numberOfElemets + " elementów");
    }
}