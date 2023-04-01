package com.au.aon.demo;

/**
 * @author Archi Madhu
 */
public class FindIndex {
    /**
     *
     * @param array1 integer array
     * @param array2 integer array
     * @return index of sub array in main array
     */
    public static int findSubArrayIndex(int[] array1, int[] array2) {
            tryNextOuterNumber:
            for (int itri = 0; itri <= array1.length - array2.length; itri++) {
                for (int itrj = 0; itrj < array2.length; itrj++) {
                    if (array1[itri + itrj] != array2[itrj]) {
                        continue tryNextOuterNumber;
                    }
                }

                return itri;
            }
            return -1;
        }

}
