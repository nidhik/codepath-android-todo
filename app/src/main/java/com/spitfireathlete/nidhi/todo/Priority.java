package com.spitfireathlete.nidhi.todo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nidhikulkarni on 1/24/16.
 */
public enum Priority {
    LOW("LOW"),
    MEDIUM("MEDIUM"),
    HIGH("HIGH");

    private static Map<Integer, Priority> valuesToPriority = new HashMap<Integer, Priority>();

    private final String text;
    Priority(String text) {
        this.text = text;
    }

    public static Priority fromValue(int value) {

        if (valuesToPriority.isEmpty()) {
            for (Priority p : Priority.values()) {
                valuesToPriority.put(p.ordinal(), p);
            }
        }
        return valuesToPriority.get(value);
    }

    @Override
    public String toString() {
        return this.text;
    }


}
