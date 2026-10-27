package demo.method;

import java.util.Objects;

/**
 * Methods that return their first argument. Look for: {@code @Identity} on {@code requireNonNull} and
 * {@code requirePositive}; not on {@code orDefault}, which may return its second.
 */
public final class Checks {
    private Checks() {
    }

    public static <T> T requireNonNull(T t, String what) {
        Objects.requireNonNull(t, what);
        return t;
    }

    public static int requirePositive(int i) {
        if (i <= 0) throw new IllegalArgumentException("not positive: " + i);
        return i;
    }

    public static String orDefault(String s, String dflt) {
        return s == null ? dflt : s;
    }
}
