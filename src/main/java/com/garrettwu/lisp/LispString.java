// (c) Copyright 2011 Garrett Wu

package com.garrettwu.lisp;

/**
 * A string value in lisp.
 */
public class LispString extends LispAtom {
  /** The string value. */
  private final String mValue;

  /**
   * Creates a new <code>LispString</code> instance.
   *
   * @param value The string value.
   */
  public LispString(String value) {
    super();
    mValue = value;
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return LispLiterals.STRING_START + mValue + LispLiterals.STRING_END;
  }
}
