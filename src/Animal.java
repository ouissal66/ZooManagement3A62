public class Animal {

    String family;
     String name;
     int age;
     boolean isMammal;

     public Animal(String family, String name, int age, boolean isMammal) {
         this.family = family;
         this.name = name;
         this.age = age;
         this.isMammal = isMammal;

     }
    public String getFamily() { return family; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean isMammal() { return isMammal; }

    @Override
    public String toString() {
        return "Animal{" + "family='" + family + " name='" + name + "age=" + age + "isMammal=" + isMammal + '}';
    }
    public void display() {
        System.out.println( "family:" + family +"Name: " + name + ", Age: " + age+ "isMammal:" + isMammal);
    }
}

