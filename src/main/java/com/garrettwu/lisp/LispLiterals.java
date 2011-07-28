// (c) Copyright 2011 Garrett Wu

package com.garrettwu.lisp;

/**
 * A utility class of constants that appear in lisp code.
 */
public final class LispLiterals {
  /** Marks the beginning of a list. */
  public static final String LIST_START = "(";
  /** Marks the end of a list. */
  public static final String LIST_END = ")";
  /** The separator used between elements of a lisp list. */
  public static final String LIST_SEPARATOR = " ";

  /** Marks the beginning of a string literal. */
  public static final String STRING_START = "\"";
  /** Marks the end of a string literal. */
  public static final String STRING_END = "\"";

  /** Quotes an element. */
  public static final String QUOTE_PREFIX = "'";

  /** Disable the constructor. */
  private LispLiterals() {}
}
