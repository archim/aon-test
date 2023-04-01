package com.au.aon.test;

import java.util.logging.Logger;

public class MeasureExecutionTime {
    final static Logger log = Logger.getLogger(MeasureExecutionTime.class.getName());
    public void measureMethodExecutionTime(IncDec incDec) {
        log.info("Increment took - " + measureTimeToIncrement(incDec) + " milliseconds");
        log.info("Decrement took - " + measureTimeToDecrement(incDec) + " milliseconds");
    }
    public long measureTimeToIncrement(IncDec incDec){
        final long startTime = System.currentTimeMillis();
        log.info("measureTimeToIncrement > startTime " + startTime);
        incDec.increment();
        final long stopTime = System.currentTimeMillis();
        log.info("measureTimeToIncrement > stopTime " + stopTime);
        final long timeTakenInMilliSec = stopTime - startTime;
        // log.info("time - " + elapsedTime);
        return timeTakenInMilliSec;
    }

    public long measureTimeToDecrement(IncDec incDec){
        final long startTime = System.currentTimeMillis();
        log.info("measureTimeToDecrement > startTime " + startTime);
        incDec.decrement();
        final long stopTime = System.currentTimeMillis();
        log.info("measureTimeToDecrement > stopTime " + stopTime);

        final long timeTakenInMilliSec = stopTime - startTime;
        // log.info("time - " + elapsedTime);
        return timeTakenInMilliSec;
    }

}
