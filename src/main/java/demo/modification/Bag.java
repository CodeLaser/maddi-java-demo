package demo.modification;

import java.util.ArrayList;
import java.util.List;

/**
 * Mutable, but a container: no method changes the objects it is given. Look for: {@code @Container} on the type,
 * {@code add} modifying the bag, the field {@code items} modified, {@code size} not modifying.
 */
public class Bag {
    private final List<String> items = new ArrayList<>();

    public void add(String item) {
        items.add(item);
    }

    public int size() {
        return items.size();
    }

    public boolean contains(String item) {
        return items.contains(item);
    }
}
