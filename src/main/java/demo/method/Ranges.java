package demo.method;

import io.codelaser.maddi.annotation.Commutable;

/**
 * Contracted commutation: the arguments of {@code span} may be swapped. {@code @Commutable} is a contract; the IDE
 * does not show it today.
 */
public final class Ranges {
    private Ranges() {
    }

    public static int span(@Commutable int a, @Commutable int b) {
        return Math.abs(a - b);
    }
}
