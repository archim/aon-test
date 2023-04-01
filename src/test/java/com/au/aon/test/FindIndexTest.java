package com.au.aon.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class FindIndexTest {

    @DisplayName("Test FindIndex.findSubArrayIndex()")
    @Test
    void findSubArrayIndex() {

        final int[] array1 = {4, 9, 3, 7, 8};
        final int[] array2 = {0, 8};

        assertNotEquals(FindIndex.findSubArrayIndex(array1, array2), 2);
        assertEquals(FindIndex.findSubArrayIndex(array1, array2), -1);

        final int[] array3 = {7, 8};
        assertNotEquals(FindIndex.findSubArrayIndex(array1, array3), -1);
        assertEquals(FindIndex.findSubArrayIndex(array1, array3), 3);

        final int[] array4 = {9, 3};
        assertEquals(FindIndex.findSubArrayIndex(array1, array4), 1);
    }
}