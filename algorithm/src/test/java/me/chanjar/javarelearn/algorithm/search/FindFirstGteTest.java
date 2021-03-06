package me.chanjar.javarelearn.algorithm.search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindFirstGteTest {

  FindFirstGte search = new FindFirstGte();

  @Test
  public void search() {

    assertEquals(-1, search.search(new int[0], 1));
    assertEquals(0, search.search(new int[] { 1 }, 1));
    assertEquals(-1, search.search(new int[] { 1 }, 2));

    assertEquals(0, search.search(new int[] { 1, 2, 3 }, 0));
    assertEquals(0, search.search(new int[] { 1, 2, 3 }, 1));
    assertEquals(1, search.search(new int[] { 1, 2, 3 }, 2));
    assertEquals(2, search.search(new int[] { 1, 2, 3 }, 3));
    assertEquals(-1, search.search(new int[] { 1, 2, 3 }, 4));

    assertEquals(0, search.search(new int[] { 1, 1, 1, 2, 2, 2, 3, 3, 3 }, 0));
    assertEquals(0, search.search(new int[] { 1, 1, 1, 2, 2, 2, 3, 3, 3 }, 1));
    assertEquals(3, search.search(new int[] { 1, 1, 1, 2, 2, 2, 3, 3, 3 }, 2));
    assertEquals(6, search.search(new int[] { 1, 1, 1, 2, 2, 2, 3, 3, 3 }, 3));
    assertEquals(-1, search.search(new int[] { 1, 1, 1, 2, 2, 2, 3, 3, 3 }, 4));

    assertEquals(0, search.search(new int[] { 1, 1, 1, 3, 3, 3, 5, 5, 5 }, 0));
    assertEquals(3, search.search(new int[] { 1, 1, 1, 3, 3, 3, 5, 5, 5 }, 2));
    assertEquals(6, search.search(new int[] { 1, 1, 1, 3, 3, 3, 5, 5, 5 }, 4));
    assertEquals(-1, search.search(new int[] { 1, 1, 1, 3, 3, 3, 5, 5, 5 }, 6));
  }
}
