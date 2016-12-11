public class Main {

    public static void main(String[] args) {
        // write testcode here
      /*  Phonebook phonebook = new Phonebook();
        phonebook.add("Pekka Mikkola", "040-123123");
        phonebook.add("Edsger Dijkstra", "045-456123");
        phonebook.add("Donald Knuth", "050-222333");

        String number = phonebook.searchNumber("Pekka Mikkola");
        System.out.println( number );

        number = phonebook.searchNumber("Martti Tienari");
        System.out.println( number );
*/
        Phonebook p = new Phonebook();
        p.add("Pekka", "040-123654");
        p.add("Jukka", "045-332211");
        p.searchNumber("Pekka");
    }
}
