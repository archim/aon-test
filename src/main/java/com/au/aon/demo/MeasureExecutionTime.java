package com.au.aon.demo;

import java.util.logging.Logger;

/**
 * @author Archi Madhu
 * This class is used to measure time taken to execute a method.
 */
public class MeasureExecutionTime {
    final static Logger log = Logger.getLogger(MeasureExecutionTime.class.getName());

    /**
     *
     * @param incDec
     * @return time taken to execute increment method from client of IncDec interface
     */
    public long measureTimeToIncrement(IncDec incDec) {
        // did put some logger to get time > 0, otherwise execution is so quick sometimes you get 0 as elaspsed time
        final long startTime = System.currentTimeMillis();
        log.info("measureTimeToIncrement > startTime " + startTime);
        incDec.increment();
        final long stopTime = System.currentTimeMillis();
        log.info("measureTimeToIncrement > stopTime " + stopTime);
        final long timeTakenInMilliSec = stopTime - startTime;
        log.info("Increment took - " + timeTakenInMilliSec + " milliseconds");
        return timeTakenInMilliSec;
    }

    /**
     *
     * @param incDec
     * @return time taken to execute decrement method from client of IncDec interface
     */
    public long measureTimeToDecrement(IncDec incDec) {
        final long startTime = System.currentTimeMillis();
        log.info("measureTimeToDecrement > startTime " + startTime);
        incDec.decrement();
        final long stopTime = System.currentTimeMillis();
        log.info("measureTimeToDecrement > stopTime " + stopTime);
        final long timeTakenInMilliSec = stopTime - startTime;
        log.info("Increment took - " + timeTakenInMilliSec + " milliseconds");
        return timeTakenInMilliSec;
    }

}
