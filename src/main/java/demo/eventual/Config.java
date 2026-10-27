package demo.eventual;

import io.codelaser.maddi.support.SetOnce;

/**
 * Eventually immutable through {@link SetOnce}: mutable until both values are set, immutable after. Look for:
 * {@code @Mark("host,port")} on {@code init}, {@code @Only(after=...)} on the getters, and
 * {@code @Immutable(hc=true, after="host,port")} on the type.
 */
public class Config {
    private final SetOnce<String> host = new SetOnce<>();
    private final SetOnce<Integer> port = new SetOnce<>();

    public void init(String h, int p) {
        host.set(h);
        port.set(p);
    }

    public String host() {
        return host.get();
    }

    public int port() {
        return port.get();
    }
}
