package demo.rare;

import io.codelaser.maddi.annotation.type.Singleton;

/**
 * A singleton: one private constructor, called once from a static field. {@code @Singleton} is a contract; the
 * analyzer neither computes nor shows it today.
 */
@Singleton
public final class Clock {
    public static final Clock INSTANCE = new Clock();

    private long ticks;

    private Clock() {
    }

    public long tick() {
        return ++ticks;
    }
}
