package demo.rare;

/** Global state, changed by {@link SettingsClient}. */
public class Settings {
    static int level;

    public static void raise() {
        level++;
    }
}
