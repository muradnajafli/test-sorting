package com.epam.rd.autotasks;

import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.*;


public class SortingTest {

    Sorting sorting = new Sorting();

    @Test(expected = IllegalArgumentException.class)
    public void testNullCase(){
        int[] array = null;
        sorting.sort(array);

    }

    @Test
    public void testEmptyCase(){
        int[] array = {};
        sorting.sort(array);
        assertArrayEquals(new int[]{}, array);
    }

    @Test
    public void testSingleElementArrayCase() {
        int[] array = {1};
        sorting.sort(array);
        Assert.assertArrayEquals(new int[]{1}, array);

    }

    @Test
    public void testSortedArraysCase() {
        int[] array = {1, 2, 3, 4, 5};
        sorting.sort(array);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testOtherCases() {
        int[] array = {1, 2, 4, 3, 5};
        sorting.sort(array);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

}