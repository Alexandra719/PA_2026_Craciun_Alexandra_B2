// Clasa Person implementează Profile și Comparable pentru ordinea naturală
public class Person implements Profile, Comparable<Person>{
    private String name;
    private String id;
    private int age;
    // Constructor
    public Person(String name, int age, String id) {
        this.id = id;
        this.name = name;
        this.age = age;

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
    public int getAge() {
        return age;
    }
    // Afișare obiect pentru test
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
    @Override
    public int compareTo(Person other) {
        return this.getName().compareTo(other.getName());
    }
}
