package demo.rare;

import io.codelaser.maddi.annotation.type.ExtensionClass;

/**
 * Extension methods for {@link String}: every static method takes a non-null {@code String} first.
 * {@code @ExtensionClass} is a contract; the analyzer neither computes nor shows it today.
 */
@ExtensionClass(of = String.class)
public final class Strings {
    private Strings() {
    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static boolean isPalindrome(String s) {
        return s.equals(reverse(s));
    }

    public static String repeat(String s, int n) {
        return s.repeat(n);
    }
}
