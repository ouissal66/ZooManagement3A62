package tn.esprit.gestionZoo.entities;

public class Animal {

    String family;
     String name;
     int age;

    public Animal(String name, String family, int age) {
        this.setName(name);
        this.setFamily(family);
        this.setAge(age);

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("name cannot be empty");
        } else {
            this.name = name;
        }
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("age cannot be negative");
            this.age = 0;
        } else {
            this.age = age;
        }
    }


    public void display() {
        System.out.println("Nom : " + name + ", Famille : " + family + ", Âge : " + age);
    }
}

