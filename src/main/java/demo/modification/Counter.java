package demo.modification;

/**
 * The simplest mutable class. Look for: {@code inc()} and {@code reset()} modify, {@code value()} does not.
 */
public class Counter {
    private int count;

    public void inc() {
        count++;
    }

    public void reset() {
        count = 0;
    }

    public int value() {
        return count;
    }
}
