import java.util.*;

public class Library {

    private String name;
    private String address;
    private Set<Department> departments;

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
        this.departments = new HashSet<Department>();
    }

    void addDepartment(Department department){
        departments.add(department);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(name, library.name) &&
                Objects.equals(address, library.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
