// (c) Copyright 2011 Garrett Wu

package com.garrettwu.lisp;

public class LispQuotedElement extends LispElement {
  /** The quoted lisp element. */
  private LispElement mQuotedElement;

  /**
   * Creates a new <code>LispElement</code> instance.
   *
   * @param quotedElement The element to be quoted.
   */
  public LispQuotedElement(LispElement quotedElement) {
    super();
    mQuotedElement = quotedElement;
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return LispLiterals.QUOTE_PREFIX + mQuotedElement.toString();
  }
}
