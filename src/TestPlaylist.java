public class TestPlaylist {
    public static void main(String[] args) {
        Playlist p1 = new Playlist("My Favorite Songs");

        p1.addSong("Song 1");
        p1.addSong("Song 2");
        p1.addSong("Song 3");

        p1.printSongs();
        System.out.println("Total songs: " + p1.getSongCount());

        System.out.println("\nRemoving 'Song 2'...\n");
        p1.removeSong("Song 2");

        p1.printSongs();
        System.out.println("Total songs: " + p1.getSongCount());
    }
}
