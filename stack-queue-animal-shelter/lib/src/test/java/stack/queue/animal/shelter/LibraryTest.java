/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.queue.animal.shelter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {



        @Test
        void testEnqueueAndDequeue() {
            AnimalShelter shelter = new AnimalShelter();
            shelter.enqueue(new Animal("dog", "xxx"));
            shelter.enqueue(new Animal("dog", "yyy"));
            shelter.enqueue(new Animal("cat", "zzz"));
            Animal dog1 = shelter.dequeue("dog");
            Animal cat1 = shelter.dequeue("cat");

            Animal invalidAnimal = shelter.dequeue("rabbit");

            assertEquals("xxx", dog1.name);
            assertEquals("cat", cat1.species);
            assertEquals("zzz", cat1.name);

            assertNull(invalidAnimal);
        }

        @Test
        void testEnqueueWithInvalidSpecies() {
            AnimalShelter shelter = new AnimalShelter();
            shelter.enqueue(new Animal("dog", "ttt"));
            shelter.enqueue(new Animal("cat", "qqq"));
            shelter.enqueue(new Animal("rabbit", "ccc"));
            shelter.enqueue(new Animal("dog", "zzz"));
            shelter.enqueue(new Animal("cat", "ccc"));



            assertEquals(2, shelter.dogQueue.size());
            assertEquals(2, shelter.catQueue.size());
        }

        @Test
        void testDequeueWhenQueueIsEmpty() {
            AnimalShelter shelter = new AnimalShelter();

            Animal cat = shelter.dequeue("cat");
            Animal dog = shelter.dequeue("dog");

            assertNull(cat);
            assertNull(dog);
        }
    }


