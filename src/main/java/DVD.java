import java.util.Arrays;
import java.util.Objects;

public class DVD extends Article{

    private String director;
    private String[] actors;


    public DVD(Integer referenceNumber, String name, String director, String[] actors) {
        super(referenceNumber, name);
        this.director = director;
        this.actors = actors;
    }

    //Getters and Setters
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    //Equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DVD dvd = (DVD) o;
        return Objects.equals(director, dvd.director) &&
                Arrays.equals(actors, dvd.actors);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(director);
        result = 31 * result + Arrays.hashCode(actors);
        return result;
    }

    //toString
    @Override
    public String toString() {
        return "DVD{" +
                "director='" + director + '\'' +
                ", actors=" + Arrays.toString(actors) +
                '}';
    }
}
