package demo.independence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Three ways to hand out a field. Look for: {@code @Independent} on {@code copy()}, and {@code @UnmodifiableView} on
 * {@code view()}. {@code exposed()} (the caller can change the inventory through it) and {@code view()} (it shows
 * later changes) are {@code @Dependent}, the default, which the hints show under <em>Show all</em>.
 */
public class Inventory {
    private final List<String> items = new ArrayList<>();

    public void add(String item) {
        items.add(item);
    }

    public List<String> exposed() {
        return items;
    }

    public List<String> copy() {
        return new ArrayList<>(items);
    }

    public List<String> view() {
        return Collections.unmodifiableList(items);
    }
}
