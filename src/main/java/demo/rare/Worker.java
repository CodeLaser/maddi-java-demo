package demo.rare;

import io.codelaser.maddi.annotation.rare.AllowsInterrupt;

/**
 * A method during which other threads may act. {@code @AllowsInterrupt} on {@code pause} is a contract; the IDE
 * does not show it today.
 */
public class Worker {
    private int done;

    @AllowsInterrupt
    public void pause() throws InterruptedException {
        Thread.sleep(10);
    }

    public void work() throws InterruptedException {
        done++;
        pause();
    }

    public int done() {
        return done;
    }
}
