package demo.method;

/**
 * A builder. Look for: {@code @Fluent} on the methods that return {@code this}, and {@code @NotModified} on
 * {@code build}. The fluent methods also modify, and are {@code @Independent}; both follow (a method modifies by
 * default, and returning {@code this} is independent), so the hints show them under <em>Show all</em>.
 */
public class Sentence {
    private final StringBuilder sb = new StringBuilder();

    public Sentence word(String w) {
        if (!sb.isEmpty()) sb.append(' ');
        sb.append(w);
        return this;
    }

    public Sentence period() {
        sb.append('.');
        return this;
    }

    public String build() {
        return sb.toString();
    }
}
