public class Zoo {
    Animal[] animals;
     String name;
     String city;
     int nbrCages;
     int count;
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];
        this.count = 0;
    }
    public boolean addAnimal(Animal a) {
        if (a == null) return false;
        if (count >= animals.length) return false;
        if (count >= nbrCages) return false;
        animals[count++] = a;
        return true;
    }
    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville      : " + city);
        System.out.println("Nbr cages  : " + nbrCages);
        System.out.println("Nbr animaux: " + count);
    }

}


