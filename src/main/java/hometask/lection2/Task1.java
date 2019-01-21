package hometask.lection2;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Cat {
    String name;

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Vasia");
        set.add("Barsik");
        set.add("Mila");
        set.add("Dysia");
        set.add("Viola");
        set.add("Hola");
        set.add("Anna");
        set.add("Sveta");
        set.add("Olimp");
        set.add("Runa");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();

            System.out.println(name);
        }
    }
}
