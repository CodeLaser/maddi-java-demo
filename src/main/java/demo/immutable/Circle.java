package demo.immutable;

/** Implements {@link Shape}. Look for: {@code @ImmutableContainer}, as the interface demands. */
public record Circle(double radius) implements Shape {
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
