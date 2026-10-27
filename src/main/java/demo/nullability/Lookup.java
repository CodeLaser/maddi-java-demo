package demo.nullability;

import java.util.Map;

/**
 * Null in and out: {@code find} may return null, {@code describe} accepts null, {@code name} dereferences its
 * parameter unconditionally. Look for: {@code @Nullable} on {@code find}'s result and on {@code describe}'s
 * parameter; {@code @NotNull}, hidden by default, on the rest, {@code name}'s parameter included.
 */
public class Lookup {
    private final Map<String, String> entries;

    public Lookup(Map<String, String> entries) {
        this.entries = Map.copyOf(entries);
    }

    public String find(String key) {
        return entries.get(key);
    }

    public int name(String s) {
        return s.length();
    }

    public String describe(String s) {
        return s == null ? "(none)" : s;
    }

    public String findOrEmpty(String key) {
        String v = entries.get(key);
        return v == null ? "" : v;
    }
}
