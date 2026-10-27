package demo.modification;

import io.codelaser.maddi.annotation.type.UtilityClass;

import java.util.Collections;
import java.util.List;

/**
 * Methods that change their arguments, and one that only reads. Look for: {@code @Modified} on the {@code list}
 * parameters of {@code sortInPlace} and {@code addTwice}, {@code @NotModified} on {@code first}'s.
 * <p>
 * {@code @UtilityClass} is a contract: the analyzer does not compute it, and the IDE does not show it today.
 */
@UtilityClass
public final class ListTools {
    private ListTools() {
    }

    public static void sortInPlace(List<String> list) {
        Collections.sort(list);
    }

    public static void addTwice(List<String> list, String s) {
        list.add(s);
        list.add(s);
    }

    public static String first(List<String> list) {
        return list.get(0);
    }
}
