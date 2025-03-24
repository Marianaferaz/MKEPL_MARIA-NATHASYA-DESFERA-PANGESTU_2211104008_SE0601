package song_refactor;

public class Main {
    public static void main(String[] args) {
        Song song = new Song("2", "AUTOBAHN", "2025", "autobahn.mp3");

        Artist artist = new Artist("Song Mingi", "Mingi ATEEZ", "image.jpg");
        song.setArtist(artist);

        Album album = new Album("Desire Project", "cover.jpg");
        song.setAlbum(album);

        // Mengatur genre lagu
        song.setGenre(Genre.ROCK);

        // Menampilkan informasi lagu
        song.printInfo(3);
    }
}
