public class FaveSong {
    public static void main(String[] args) {
        String songLyrics = "She's fallin' in love now\n" + "Losin' control now\n" + "Fightin' the truth\n" + "Tryin' to hide\n" + "But I think it's alright, girl\n" + "Yeah, I think it's alright, girl, ooh\n";

       
        // Split the song lyrics into the lines
        String[] lines = songLyrics.split("\n");

        // Display the first four lines of the song lyrics
        for (int i = 0; i < 6 && i < lines.length; i++) {
            System.out.println(lines[i]);
        }
    }
}