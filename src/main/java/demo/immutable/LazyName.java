package demo.immutable;

/**
 * A field without the {@code final} keyword that is only assigned in the constructor. Look for: {@code @Final} on
 * the field {@code name}.
 */
public class LazyName {
    private String name;
    private int reads;

    public LazyName(String name) {
        this.name = name;
    }

    public String name() {
        reads++;
        return name;
    }

    public int reads() {
        return reads;
    }
}
