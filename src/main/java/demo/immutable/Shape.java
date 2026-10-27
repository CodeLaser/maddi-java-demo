package demo.immutable;

import io.codelaser.maddi.annotation.ImmutableContainer;

/**
 * A contract on an interface: implementations must be immutable containers. Look for: the contract shown on the
 * interface, and {@link Circle} verified against it.
 */
@ImmutableContainer
public interface Shape {
    double area();
}
