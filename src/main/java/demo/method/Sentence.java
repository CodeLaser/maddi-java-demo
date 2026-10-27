package demo.method;

/**
 * A builder. Look for: {@code @Fluent} on the methods that return {@code this}, {@code @Modified} on them too,
 * and {@code @NotModified} on {@code build}.
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
