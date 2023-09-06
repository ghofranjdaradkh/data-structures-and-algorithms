package stack.queue.animal.shelter;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class AnimalShelter <T> {
    private Queue<Animal> dogQueue;
    private Queue<Animal> catQueue;

    public AnimalShelter() {
        dogQueue = new LinkedList<>(); // Queue for dogs
        catQueue = new LinkedList<>(); // Queue for cats
    }


    public void enqueue(Animal animal) {
        if ("dog".equals(animal.species)) {
            dogQueue.add(animal);
        } else if ("cat".equals(animal.species)) {
            catQueue.add(animal);
        }
    }


    public Animal dequeue(String pref) {
        if ("dog".equals(pref)) {
            if (!dogQueue.isEmpty()) {
                return dogQueue.remove();
        } else if ("cat".equals(pref)) {
            if (!catQueue.isEmpty()) {
                return catQueue.remove();
            }
        }
        return null; }














