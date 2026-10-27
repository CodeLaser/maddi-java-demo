package demo.modification;

/** A mutable element, used by {@link Elements}. */
public class Item {
    private int touched;

    public void touch() {
        touched++;
    }

    public int touched() {
        return touched;
    }
}
