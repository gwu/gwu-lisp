// (c) Copyright 2011 Garrett Wu

package com.garrettwu.lisp;

/**
 * A lisp atom is a single scalar value.
 *
 * <p>This is in constrast with a list, which contains elements.</p>
 */
public abstract class LispAtom extends LispElement {
  /**
   * Creates a new <code>LispAtom</code> instance.
   */
  public LispAtom() {
    super();
  }
}
