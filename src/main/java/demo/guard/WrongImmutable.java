package demo.guard;

import io.codelaser.maddi.annotation.Immutable;

import java.util.ArrayList;
import java.util.List;

/**
 * A wrong contract, on purpose: the class claims {@code @Immutable} but {@code add} modifies it. Look for: a
 * guard finding on {@code items.add(s)}, with its why-chain in the maddi tool window.
 */
@Immutable
public class WrongImmutable {
    private final List<String> items = new ArrayList<>();

    public void add(String s) {
        items.add(s);
    }
}
