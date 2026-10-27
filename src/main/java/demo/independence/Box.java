package demo.independence;

/**
 * A mutable holder of an object it does not look into. Look for: {@code @Independent(hc=true)} on the type, the
 * field and {@code get()}: only hidden content passes; and {@code @GetSet} on {@code get} and {@code set}.
 */
public class Box<T> {
    private T content;

    public T get() {
        return content;
    }

    public void set(T content) {
        this.content = content;
    }
}
