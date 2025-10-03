public class Main {
    public static void main(String[] args) {
        Animal panda = new Animal("pandas", "pooh", 2, true);
        Zoo myZoo = new Zoo(" Belvedere", "Tunis", 600);

        myZoo.addAnimal(new Animal("elephants", "Dumbo", 10, true));
        myZoo.addAnimal(new Animal("lions", "Rex", 3, true));
        myZoo.addAnimal(new Animal("birds", "Aquila", 4, false));

        myZoo.displayZoo();

        System.out.println();


        System.out.println(myZoo);



    }
}



