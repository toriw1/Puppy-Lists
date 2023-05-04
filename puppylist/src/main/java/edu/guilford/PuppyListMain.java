package edu.guilford;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class PuppyListMain {
    public static void main(String[] args) {

        // declare a constant for the number of elements in the list and set it equal to 1000
        final int N_PUPPIES = 1000;

        // declared variables for timing sorted lists
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        DecimalFormat formatter = new DecimalFormat("0.00");
        DecimalFormat smallFormatter = new DecimalFormat("0.0000");


        // declare and instantiate an ArrayList for objects of your class.
        ArrayList<String> puppyList = new ArrayList<String>();

        // for output formatting
        System.out.println("Array List: ");

        // use a loop to add the specified number of randomly generated objects to the list
        for (int i = 0; i < N_PUPPIES; i++) {
            startTime = System.nanoTime();
            Puppy p = new Puppy();
            puppyList.add(p.toString());
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("\nAdd " + N_PUPPIES + " puppies to the list: " + smallFormatter.format(duration / 1.e6) + " milliseconds");

        // sort the list using Collections.sort and time it
        startTime = System.nanoTime();
        Collections.sort(puppyList);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Sorted List Time: " + formatter.format(duration / 1.e6) + " milliseconds");

        // shuffle the list using Collections.shuffle and time it
        startTime = System.nanoTime();
        Collections.shuffle(puppyList);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Shuffle List Time: " + formatter.format(duration / 1.e6) + " milliseconds");

        // use a loop to get a random element from the list 1,000,000 times and time it
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            int randomIndex = (int) (Math.random() * puppyList.size());
            String p = puppyList.get(randomIndex);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Get Time for Random Elements: " + formatter.format(duration / 1.e6) + " milliseconds");

        // use a loop to get each element from the loop sequentially and time it
        startTime = System.nanoTime();
        for (int i = 0; i < puppyList.size(); i++) {
            String p = puppyList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Get Time for Sequential Elements: " + smallFormatter.format(duration / 1.e6) + " milliseconds");

        // add code that repeats the above using a LinkedList implementation
        // declare and instantiate an ArrayList for objects of your class.
        LinkedList<String> puppyLinkedList = new LinkedList<String>();

        // for output formatting
        System.out.println("\nLinked List: ");
        
        // use a loop to add the specified number of randomly generated objects to the list
        for (int i = 0; i < N_PUPPIES; i++) {
            startTime = System.nanoTime();
            Puppy p = new Puppy();
            puppyLinkedList.add(p.toString());
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("\nAdd " + N_PUPPIES + " puppies to the list: " + smallFormatter.format(duration / 1.e6) + " milliseconds");

        // sort the list using Collections.sort and time it
        startTime = System.nanoTime();
        Collections.sort(puppyLinkedList);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Sort List Time: " + formatter.format(duration / 1.e6) + " milliseconds");

        // shuffle the list using Collections.shuffle and time it
        startTime = System.nanoTime();
        Collections.shuffle(puppyLinkedList);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Shuffle List Time: " + formatter.format(duration / 1.e6) + " milliseconds");

        // use a loop to get a random element from the list 1,000,000 times and time it
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            int randomIndex = (int) (Math.random() * puppyLinkedList.size());
            String p = puppyLinkedList.get(randomIndex);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Get Time for Random Elements: " + formatter.format(duration / 1.e6) + " milliseconds");

        // use a loop to get each element from the loop sequentially and time it
        startTime = System.nanoTime();
        for (int i = 0; i < puppyLinkedList.size(); i++) {
            String p = puppyLinkedList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Get Time for Sequential Elements: " + smallFormatter.format(duration / 1.e6) + " milliseconds");
    }
}
