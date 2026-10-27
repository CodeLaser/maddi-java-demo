package demo.immutable;

import io.codelaser.maddi.annotation.ImmutableContainer;

/**
 * A contract on an interface: implementations must be immutable containers. Look for: {@link Circle} verified
 * against it. The interface's own verdict is the contract written on it, so no hint repeats it.
 */
@ImmutableContainer
public interface Shape {
    double area();
}
