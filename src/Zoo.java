public class Zoo {

    public static final int MAX_CAGES = 25;

    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int count;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[MAX_CAGES];
        this.nbrCages = MAX_CAGES;
        this.count = 0;

    }
    public boolean addAnimal(Animal a) {
        if (a == null) {
            System.out.println(" invalid animal ");
            return false;
        }
        if (isFull()) {
            System.out.println("zoo full");
            return false;
        }
        for (int i = 0; i < count; i++) {
            if (animals[i].name.equals(a.name)) {
                System.out.println(" animal already exists");
                return false;
            }
        }
        animals[count++] = a;
        System.out.println("✅ " + a.name + " added to zoo " + name);
        return true;
    }
    public void displayZoo() {
        System.out.println("zoo name : " + name);
        System.out.println("city      : " + city);
        System.out.println("cages nbr  : " + nbrCages);
        System.out.println("animals nbr: " + count);
    }
    public void displayAnimals() {
        System.out.println(" animal list " + name + " :");
        for (int i = 0; i < count; i++) {
            animals[i].display();
        }
    }
    public int searchAnimal(String name) {
        for (int i = 0; i < count; i++) {
            if (animals[i].name.equals(name)) {
                return i;
            }
        }
        return -1;
    }
    public boolean removeAnimal(String name) {
        int index = searchAnimal(name);
        if (index == -1) {
            System.out.println(" Animal not found ");
            return false;
        }

        for (int i = index; i < count - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[count - 1] = null;
        count--;
        System.out.println("✅ " + name + " deleted from zoo " + this.name);
        return true;
    }
    public boolean isFull() {
        return count >= MAX_CAGES;
    }
    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        if (z1.count > z2.count)
            return z1;
        else
            return z2;
    }

}


