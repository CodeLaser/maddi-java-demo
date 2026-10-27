package demo.modification;

import java.util.ArrayList;
import java.util.List;

/**
 * Modifying a collection versus modifying what it holds. Look for: {@code @Modified(hc=true)} where only the
 * elements change ({@code touchAll}'s parameter, {@code touchOwn}), and a plain {@code @Modified} where the
 * collection itself changes ({@code addTo}'s parameter, {@code addOwn}).
 */
public class Elements {
    private final List<Item> items = new ArrayList<>();

    public static void touchAll(List<Item> list) {
        for (Item item : list) item.touch();
    }

    public static void addTo(List<Item> list, Item item) {
        list.add(item);
    }

    public void touchOwn() {
        for (Item item : items) item.touch();
    }

    public void addOwn(Item item) {
        items.add(item);
    }
}
