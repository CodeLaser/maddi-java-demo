package demo.immutable;

import java.util.List;

/**
 * Immutable through a copy: the constructor takes {@code List.copyOf} of its argument, and the getter returns that
 * unmodifiable copy. Look for: {@code @ImmutableContainer(hc=true)} on the type, {@code @Independent} on the
 * constructor parameter.
 */
public final class Snapshot {
    private final List<String> lines;

    public Snapshot(List<String> lines) {
        this.lines = List.copyOf(lines);
    }

    public List<String> lines() {
        return lines;
    }

    public int count() {
        return lines.size();
    }
}
