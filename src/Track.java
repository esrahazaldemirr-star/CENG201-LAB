/**
 * Track.java
 * Represents a single music track in a streaming playlist.
 *
 * Your Name:       Esra Hazal Demir
 * Your Student ID:  250446027
 * Your Date:        11.10.2026
 */
public class Track {
    private String title;
    private String artist;
    private int durationSeconds;
    private boolean isExplicit;

    public Track(String title, String artist, int durationSeconds, boolean isExplicit) {
        this.title = title;
        this.artist = artist;
        this.isExplicit = isExplicit;

        if (durationSeconds >= 0) {
            this.durationSeconds = durationSeconds;
        } else {
            System.out.println("Warning: Invalid duration. Setting to 0.");
            this.durationSeconds = 0;
        }
    }
    public Track(String title, String artist){
        this(title, artist, 0, false);

    }
    public Track(String title){
        this(title, "Unknown Artist", 0, false);

    }
    public Track(){
        this("Unknown Title", "Unknown Artist", 0, false);
    }
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public boolean isExplicit() {
        return isExplicit;
    }
    public String getDurationFormatted(){
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;
        return String.format("%d:%02d", minutes, seconds);
    }
    @Override
    public String toString() {
        String result = "\"" + title + "\" by " + artist + " [" + getDurationFormatted() + "]";

        if (isExplicit) {
            result = result + " [EXPLICIT]";
        }

        return result;
    }
}