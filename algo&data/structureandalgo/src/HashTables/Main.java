package HashTables;

public class Main {
    public static void main(String[] args) {
        HashTable ht = new HashTable();

        ht.set("nails", 23);
        ht.set("tile", 24);
        ht.set("plasdf", 25);

        ht.printTable();

        System.out.println(ht.get("asdfsdf"));


        System.out.println(ht.keys());
    }
}
