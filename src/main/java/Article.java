import java.util.Objects;

public abstract class Article {

    private Department department;
    private Integer referenceNumber;
    private String name;

    public Article(Integer referenceNumber, String name) {
        this.referenceNumber = referenceNumber;
        this.name = name;
    }


    public Integer getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(Integer referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(referenceNumber, article.referenceNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(referenceNumber);
    }

    @Override
    public String toString() {
        return "Article{" +
                "referenceNumber=" + referenceNumber +
                '}';
    }
}
