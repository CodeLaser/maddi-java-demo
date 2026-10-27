package demo.independence;

import java.util.List;

/**
 * Stores the list it is given: the object is linked to the caller's list. Look for: {@code @Modified} on the
 * constructor parameter, because {@code append} changes that list. The parameter, the field and {@code list()} are
 * also {@code @Dependent}, which is the default and so hidden; the hints show it under <em>Show all</em>.
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
