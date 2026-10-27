package demo.independence;

import java.util.List;

/**
 * Stores the list it is given: the object is linked to the caller's list. Look for: {@code @Dependent} on the
 * constructor parameter, the field and {@code list()}, and {@code @Modified} on the parameter, because
 * {@code append} changes that list.
 */
public class Wrapper {
    private final List<String> list;

    public Wrapper(List<String> list) {
        this.list = list;
    }

    public List<String> list() {
        return list;
    }

    public void append(String s) {
        list.add(s);
    }
}
