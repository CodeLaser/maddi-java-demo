package demo.modification;

import java.util.HashMap;
import java.util.Map;

/**
 * A map-backed registry. Look for: {@code register} and {@code clear} modify, {@code lookup} does not;
 * {@code @Dependent} on the field and the type, because the map holds the caller's keys.
 */
public class Registry {
    private final Map<String, Integer> ids = new HashMap<>();

    public void register(String name, int id) {
        ids.put(name, id);
    }

    public Integer lookup(String name) {
        return ids.get(name);
    }

    public void clear() {
        ids.clear();
    }
}
