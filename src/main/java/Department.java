import java.util.Collection;
import java.util.Objects;

public class Department {

    private Library library;
    private String name;
    private Collection<Book> books;
    private Collection<CD> CDs;
    private Collection<DVD> DVDs;

    public Department(String name) {
        this.name = name;
    }

    void addBook(Book book){
        books.add(book);
    }

    void addCD(CD cd){
        CDs.add(cd);
    }

    void addDVD(DVD dvd){
        DVDs.add(dvd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }
}
