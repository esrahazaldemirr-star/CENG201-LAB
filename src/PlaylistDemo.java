public class PlaylistDemo {
    public static void main(String[] args) {
        System.out.println("=== Playlist Track Demo ===\n");

        System.out.println("=== Playlist Track Demo ===\n");

        // 1. Default constructor testi
        System.out.println("Default Track:");
        Track t1 = new Track();
        System.out.println(t1);
        System.out.println();

        // 2. Title-only constructor testi
        System.out.println("Title-only track:");
        Track t2 = new Track("starboy");
        System.out.println(t2);
        System.out.println();

        // 3. Title + Artist constructor testi
        System.out.println("Title + Artist Track:");
        Track t3 = new Track("blinding lights", "the weeknd");
        System.out.println(t3);
        System.out.println();

        // 4. Full constructor (non-explicit) testi
        System.out.println("Full Track (non-explicit):");
        Track t4 = new Track("you belong with me", "taylor swift", 210, false);
        System.out.println(t4);
        System.out.println();

        // 5. Invalid duration (negatif süre) testi
        System.out.println("Invalid Duration Test:");
        Track t5 = new Track("locked out of heaven", "bruno mars", -45, false);
        System.out.println(t5);
        System.out.println();

        // 6. Getter testi (ayrıca getDurationFormatted testi)
        System.out.println("Getter Test:");
        Track t6 = new Track("every breathe you take", "the police", 242, true);
        System.out.println("Title:     " + t6.getTitle());
        System.out.println("Artist:    " + t6.getArtist());
        System.out.println("Duration:  " + t6.getDurationFormatted());
        System.out.println("Explicit:  " + t6.isExplicit());
    }
}
