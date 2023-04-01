package com.au.aon.test;

import java.util.logging.Logger;

/**
 * @author Archi Madhu
 */
public class Main {
    final static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        final int[] array1 = {4, 9, 3, 7, 8};
        final int[] array2 = {3, 7};
        log.info("sub array index " + FindIndex.findSubArrayIndex(array1, array2));

        measureTime();
    }
    private static void measureTime() {
        MeasureExecutionTime measureExecutionTime = new MeasureExecutionTime();
        measureExecutionTime.measureMethodExecutionTime(new MyIncDec(10));
    }

}