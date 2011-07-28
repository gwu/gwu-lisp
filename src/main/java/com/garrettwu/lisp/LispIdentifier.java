// (c) Copyright 2011 Garrett Wu

package com.garrettwu.lisp;

/**
 * A lisp identifier (a variable or name of a function).
 */
public class LispIdentifier extends LispAtom {
  /** The lisp identifier. */
  private final String mIdentifier;

  /**
   * Creates a new <code>LispIdentifier</code> instance.
   *
   * @param identifier The identifier (a.k.a. name, symbol).
   */
  public LispIdentifier(String identifier) {
    mIdentifier = identifier;
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return mIdentifier;
  }
}
