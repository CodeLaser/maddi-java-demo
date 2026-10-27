package demo.guard;

import io.codelaser.maddi.annotation.Container;

import java.util.List;

/**
 * A wrong contract, on purpose: a {@code @Container} must not modify its parameters, and {@code fill} does. Look
 * for: a guard finding on {@code fill}'s parameter.
 */
@Container
public class WrongContainer {
    public void fill(List<String> target) {
        target.add("x");
    }
}
