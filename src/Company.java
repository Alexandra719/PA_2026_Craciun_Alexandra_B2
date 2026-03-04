// Clasa Company implementează Profile și Comparable pentru ordinea naturală
public class Company implements Profile, Comparable<Company>{
    private String name;
    private String id;
    private int employees;
    // Constructor
    public Company(String name, int employees, String id) {
        this.name = name;
        this.employees = employees;
        this.id = id;
    }
    // Implementare metodă din Profile
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getId() {
        return id;
    }
    public int getEmployees() {
        return employees;
    }
    // Afișare obiect pentru test
    @Override
    public String toString() {
        return "Company{name='" + name + "', employess=" + employees + "}";
    }

    @Override
    public int compareTo(Company other) {
        return this.getName().compareTo(other.getName());
    }
}

