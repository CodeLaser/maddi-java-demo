package demo.rare;

/**
 * Changes another type's static state. Look for: {@code @StaticSideEffects} on {@code configure} (directly) and
 * {@code bump} (through {@link Settings#raise}); not on {@code compute}. {@code Settings.raise} itself has none:
 * the state it changes is its own type's.
 */
public class SettingsClient {
    public void configure() {
        Settings.level = 5;
    }

    public void bump() {
        Settings.raise();
    }

    public int compute(int x) {
        return x * 2;
    }
}
