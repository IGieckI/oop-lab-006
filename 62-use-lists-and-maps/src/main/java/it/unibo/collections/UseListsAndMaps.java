package it.unibo.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Example class using {@link List} and {@link Map}.
 *
 */
public final class UseListsAndMaps {

    private UseListsAndMaps() {
    }

    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */

        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i=1000; i < 2000; i++)
            numbers.add(i);

        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */

        LinkedList<Integer> linkLst = new LinkedList<>(numbers);

        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */

         int temp = numbers.get(0);
         numbers.set(0, numbers.get(numbers.size()-1));
         numbers.set(numbers.size()-1, temp);

        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */

        for(int i:numbers)
            System.out.println(i);

        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */

        long startTime = System.nanoTime();

        for(int i=0; i < 100000; i++)
            numbers.add(i);

        long finalTime = System.nanoTime();

        System.out.println("Arraylist: " + (finalTime - startTime));

        startTime = System.nanoTime();

        for(int i=0; i < 100000; i++)
            linkLst.add(i);

        finalTime = System.nanoTime();

        System.out.println("LinkedLst: " + (finalTime - startTime));

        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example PerfTest.java.
         */

        startTime = System.nanoTime();

        for(int i=0; i < 100000; i++)
            numbers.get(numbers.size());

        finalTime = System.nanoTime();

        System.out.println("Arraylist: " + (finalTime - startTime));

        startTime = System.nanoTime();

        for(int i=0; i < 100000; i++)
            linkLst.get(linkLst.size());

        finalTime = System.nanoTime();

        System.out.println("LinkedLst: " + (finalTime - startTime));

        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         *
         * Africa -> 1,110,635,000
         *
         * Americas -> 972,005,000
         *
         * Antarctica -> 0
         *
         * Asia -> 4,298,723,000
         *
         * Europe -> 742,452,000
         *
         * Oceania -> 38,304,000
         */

        Map<String, Long> population = new HashMap<>();
        population.put("Africa", 1110635000L);
        population.put("Americas", 972005000L);
        population.put("Antarctica", 0L);
        population.put("Asia", 4298723000L);
        population.put("Europe", 742452000L);
        population.put("Oceania", 38304000L);

        /*
         * 8) Compute the population of the world
         */

        long computation = 0;
        population.forEach((key, value) -> {
            computation+=value;
          });
        System.out.printlncom);
    }
}
