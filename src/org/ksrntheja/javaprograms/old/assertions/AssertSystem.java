/*
NOT WORKING
 */

package org.ksrntheja.javaprograms.old.assertions;

import java.util.HashMap;

// NOT WORKING
public class AssertSystem {

    public static void main(String[] args) {
        try {
            // Create a HashMap, which internally may use assertions to validate conditions
            HashMap<Integer, String> map = new HashMap<>();

            // Add some values to the map
            map.put(1, "One");
            map.put(2, "Two");
            map.put(3, "Three");

            // Now let's trigger a behavior that could involve internal assertions.
            // Normally, you'd use methods here that could internally check assertions.
            System.out.println("HashMap before removing an entry: " + map);

            // Simulate an operation that could trigger an internal assertion failure
            map.remove(4); // No key '4' exists, but we're calling remove on it
            System.out.println("HashMap after removing a non-existent key: " + map);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
