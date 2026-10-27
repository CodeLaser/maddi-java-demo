package demo.immutable;

import java.util.ArrayList;
import java.util.List;

/**
 * All fields final, but one of them is a mutable list that a method changes. Look for: {@code @Modified} on the
 * field {@code tags} and on {@code tag}. And {@code @FinalFields} on the
 * type, not {@code @Immutable}.
 */
public class Tags {
    private final String owner;
    private final List<String> tags = new ArrayList<>();

    public Tags(String owner) {
        this.owner = owner;
    }

    public void tag(String tag) {
        tags.add(owner + ":" + tag);
    }

    public int count() {
        return tags.size();
    }
}
