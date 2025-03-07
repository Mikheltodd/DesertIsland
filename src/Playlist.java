import java.util.Arrays;
import java.util.ArrayList;

public class Playlist {
    String[] favoriteSongs = new String[10];
//    String[] favoriteSongs = {"...", "...", ... , "..."};

    ArrayList<String> desertIslandPlaylist = new ArrayList<>();

    public Playlist() {
//        Favorite songs
        favoriteSongs[0] = "NSYNC - Bye Bye Bye";
        favoriteSongs[1] = "Eminem - The Real Slim Shady";
        favoriteSongs[2] = "Diomedes Díaz - Cóndor Herido";
        favoriteSongs[3] = "Enya - Only Time";
        favoriteSongs[4] = "Metallica - Nothing Else Matters";
        favoriteSongs[5] = "Queen - Bohemian  Rhapsody";
        favoriteSongs[6] = "Blink 182 - All The Small Things";
        favoriteSongs[7] = "Sum41 - In Too Deep";
        favoriteSongs[8] = "Linkin Park - Numb";
        favoriteSongs[9] = "Evanescence - Bring Me To Life";

//        Songs for desert island
        desertIslandPlaylist.add("Green Day - Macy's Day Parade");
        desertIslandPlaylist.add("Yasunori Mitsuda - Corridors Of Time");
        desertIslandPlaylist.add("+44 - 155");
        desertIslandPlaylist.add("Coldplay - A Sky Full Of Stars");
        desertIslandPlaylist.add("Elton John - Sacrifice");

        desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));
        desertIslandPlaylist.remove("Metallica - Nothing Else Matters");
        desertIslandPlaylist.remove("Eminem - The Real Slim Shady");
        desertIslandPlaylist.remove("+44 - 155");
        desertIslandPlaylist.remove("Sum41 - In Too Deep");
        desertIslandPlaylist.remove(5);
        desertIslandPlaylist.remove(4);
        desertIslandPlaylist.remove(3);
        desertIslandPlaylist.remove(2);
        desertIslandPlaylist.remove(1);
        desertIslandPlaylist.remove(0);

        int songA = desertIslandPlaylist.indexOf("Enya - Only Time");
        int songB = desertIslandPlaylist.indexOf("Linkin Park - Numb");

        String tempA = desertIslandPlaylist.get(songA);
        desertIslandPlaylist.set(songA, desertIslandPlaylist.get(songB));
        desertIslandPlaylist.set(songB, tempA);

    }

    public void playSongs() {
        System.out.println("First three songs of favorite list: ");
        System.out.println("\t-" + favoriteSongs[0]);
        System.out.println("\t-" + favoriteSongs[1]);
        System.out.println("\t-" + favoriteSongs[2]);
        System.out.println("Songs for a desert island...");
        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());
    }
}
