package stack.queue.animal.shelter;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {

    Queue<Animal> dogQueue;
    Queue<Animal> catQueue;

    public AnimalShelter() {
        dogQueue = new LinkedList<>();
        catQueue = new LinkedList<>();
    }

    public void enqueue(Animal animal) {
        if ("dog".equals(animal.species)) {
            dogQueue.offer(animal);
        } else if ("cat".equals(animal.species)) {
            catQueue.offer(animal);
        }
    }

    public Animal dequeue(String pref) {
        if ("cat".equals(pref) && !catQueue.isEmpty()) {
            return catQueue.poll();
        } else if ("dog".equals(pref) && !dogQueue.isEmpty()) {
            return dogQueue.poll();
        }
        return null;
    }


    public void displayCatQueue() {
        System.out.print("catQueue: ");
        for (Animal cat : catQueue) {
            System.out.print("Name: " + cat.name + " -> Species: " + cat.species + ", ");
        }
        System.out.println();
    }

    public void displayDogQueue() {
        System.out.print("dogQueue: ");
        for (Animal dog : dogQueue) {
            System.out.print("Name: " + dog.name + " -> Species: " + dog.species + ", ");
        }
        System.out.println();
    }



}

