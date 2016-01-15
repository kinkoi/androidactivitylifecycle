package com.klo.android.activitylifecycle;

/**
 * Created by kinkoi.lo on 1/15/16.
 * <p/>
 * Copyright (c) 2016 Symphony Inc. All rights reserved.
 */
public class ActivityInstanceCounter {
    private static ActivityInstanceCounter ourInstance = new ActivityInstanceCounter();

    public static ActivityInstanceCounter getInstance() {
        return ourInstance;
    }

    private int counter;
    private ActivityInstanceCounter() {
        counter = 0;
    }

    public int getNextCount() {
        counter++;
        return counter;
    }

}
