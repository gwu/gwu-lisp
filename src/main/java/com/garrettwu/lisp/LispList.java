// (c) Copyright 2011 Garrett Wu

package com.garrettwu.lisp;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;

/**
 * A lisp "list" construct.
 */
public class LispList extends LispElement implements Iterable<LispElement> {
  /** The elements of the list. */
  private final List<LispElement> mElements;

  /**
   * Construct an empty list.
   */
  public LispList() {
    this(Collections.<LispElement>emptyList());
  }

  /**
   * Constructor.
   *
   * @param elements The elements of the list.
   */
  public LispList(List<LispElement> elements) {
    super();
    mElements = elements;
  }

  @Override
  public Iterator<LispElement> iterator() {
    return mElements.iterator();
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(LispLiterals.LIST_START);
    sb.append(StringUtils.join(iterator(), LispLiterals.LIST_SEPARATOR));
    sb.append(LispLiterals.LIST_END);
    return sb.toString();
  }
}
