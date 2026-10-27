package demo.immutable;

/**
 * A record of primitives: as strong as it gets. Look for: {@code @ImmutableContainer} on the type.
 */
public record Point(int x, int y) {

    public Point translate(int dx, int dy) {
        return new Point(x + dx, y + dy);
    }

    public int manhattan() {
        return Math.abs(x) + Math.abs(y);
    }
}
