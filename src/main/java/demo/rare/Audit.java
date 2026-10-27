package demo.rare;

import io.codelaser.maddi.annotation.rare.IgnoreModifications;

import java.util.ArrayList;
import java.util.List;

/**
 * Logging that should not count as a modification. Look for: the contracted {@code @IgnoreModifications} on
 * {@code log}, so that {@code twice} is {@code @NotModified} although it calls {@code log}; {@code add} still
 * modifies, because of {@code total}.
 */
public class Audit {
    private final List<String> buffer = new ArrayList<>();
    private int total;

    @IgnoreModifications
    public void log(String s) {
        buffer.add(s);
    }

    public int twice(int x) {
        log("twice");
        return 2 * x;
    }

    public void add(int x) {
        log("add");
        total += x;
    }
}
