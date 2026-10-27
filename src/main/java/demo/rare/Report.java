package demo.rare;

import io.codelaser.maddi.annotation.rare.Finalizer;

/**
 * A finalizer: after {@code build()} the object must not be used. Look for: the contracted {@code @Finalizer} on
 * {@code build}, and {@code @Fluent} on {@code line}.
 */
public class Report {
    private final StringBuilder sb = new StringBuilder();

    public Report line(String s) {
        sb.append(s).append('\n');
        return this;
    }

    @Finalizer
    public String build() {
        return sb.toString();
    }
}
