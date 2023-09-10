package stack.queue.animal.shelter;

public class Animal {
    String species;
    String name;

    public Animal(String species, String name) {
        this.species = species;
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
