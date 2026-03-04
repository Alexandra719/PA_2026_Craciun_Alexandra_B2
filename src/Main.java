import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Creăm o listă comună pentru Profile (poate conține Person și Company)
        List<Profile> list = new ArrayList<>();

        // Adăugăm obiecte diferite
        list.add(new Person("Maria",21,"1"));
        list.add(new Company("Apple", 50000,"2"));
        list.add(new Company("Microsoft",120000,"3"));
        list.add(new Person("Andrei",24,"4"));

        // Sortăm lista folosind Comparator: ordonăm alfabetic după nume
        // Nu folosim Comparable direct pentru că lista conține ambele tipuri
        list.sort(Comparator.comparing(Profile::getName));

        // Afișăm lista sortată
        for(Profile p : list) {
            System.out.println(p);
        }
    }
}