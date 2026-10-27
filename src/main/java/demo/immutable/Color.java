package demo.immutable;

/** An enum without state. Look for: {@code @ImmutableContainer} on the type. */
public enum Color {
    RED, GREEN, BLUE;

    public Color next() {
        return values()[(ordinal() + 1) % values().length];
    }
}
