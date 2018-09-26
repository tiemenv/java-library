public class Program {
    public static void main(String[] args) {
        Library library = new Library("Biekorf", "Brugge");
        Department fiction = new Department("fiction");
        Department nonFiction = new Department("non-fiction");
        library.addDepartment(fiction);
        library.addDepartment(nonFiction);
        Book nineteeneightyfour = new Book(1,"1984", "George Orwell");
        Book lifeThreePointO = new Book(2, "Life 3.0", "Max Tegmark");
        fiction.addBook(nineteeneightyfour);
        nonFiction.addBook(lifeThreePointO);
        CD madvillainy = new CD(3,"Madvillainy","Madvillain");
        fiction.addCD(madvillainy);
        DVD pulpFiction = new DVD(4,"Pulp Fiction", "Quentin Tarantino", new String[]{"John Travolta", "Samuel L. Jackson", "Uma Thurman", "Quentin Tarantino"});
        DVD superSizeMe = new DVD(5, "Super-size Me","That one American reporter", new String[]{"The same dude"});
        fiction.addDVD(pulpFiction);
        fiction.addDVD(superSizeMe);
    }
}
