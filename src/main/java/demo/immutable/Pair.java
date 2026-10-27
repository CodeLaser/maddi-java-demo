package demo.immutable;

/**
 * Immutable, but with hidden content: the analyzer cannot see inside {@code A} and {@code B}. Look for:
 * {@code @ImmutableContainer(hc=true)} on the type. The accessors' {@code @Independent(hc=true)} follows from it,
 * so the hints show it under <em>Show all</em>.
 */
public final class Pair<A, B> {
    private final A first;
    private final B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A first() {
        return first;
    }

    public B second() {
        return second;
    }

    public Pair<B, A> swap() {
        return new Pair<>(second, first);
    }
}
