import java.util.Objects;

public class CD extends Article {

    private String artist;

    public CD(Integer referenceNumber, String name, String artist) {
        super(referenceNumber, name);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CD cd = (CD) o;
        return Objects.equals(artist, cd.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), artist);
    }

    @Override
    public String toString() {
        return "CD{" +
                "artist='" + artist + '\'' +
                '}';
    }
}
