package demo.eventual;

import io.codelaser.maddi.support.EventuallyFinalOnDemand;

/**
 * Editable until committed. Look for: {@code @Only(before="text")} on {@code edit}, {@code @Mark("text")} on
 * {@code commit}, {@code @TestMark("text")} on {@code isCommitted}, and {@code @NotModified(after="text")} on
 * {@code length}.
 */
public class Document {
    private final EventuallyFinalOnDemand<String> text = new EventuallyFinalOnDemand<>();

    public void edit(String s) {
        text.setVariable(s);
    }

    public void commit(String s) {
        text.setFinal(s);
    }

    public boolean isCommitted() {
        return text.isFinal();
    }

    public int length() {
        return text.get().length();
    }
}
