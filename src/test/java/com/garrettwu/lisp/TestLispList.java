// (c) Copyright 2011 Garrett Wu

package com.garrettwu.lisp;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestLispList {
  @Test
  public void testList() {
    LispElement list = new LispList(
        Arrays.asList(
            new LispStringAtom("apple"),
            new LispList(
                Arrays.asList(
                    new LispStringAtom("banana"),
                    new LispStringAtom("carrot"),
                    new LispList()))));
    assertEquals("(\"apple\" (\"banana\" \"carrot\" ()))", list.toString());
  }
}
