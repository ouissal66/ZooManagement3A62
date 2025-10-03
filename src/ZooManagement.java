import java.util.Scanner;

public class ZooManagement {

        int nbrCages = 20;
        String zooName = "my zoo";

      public ZooManagement(){}
      public static void main(String[] args) {
          ZooManagement zoo = new ZooManagement();
          Scanner scan = new Scanner(System.in);
          System.out.println("Welcome to the Zoo" +zoo );
          while(true){
              System.out.println("enter the name of the zoo");
              String input = scan.nextLine();
              if (!input.isEmpty()) {
                  zoo.zooName = input;
                  break;
              }else{
                  System.out.println("zoo name cannot be empty");
              }
          }
          while(true){
              System.out.println("enter the number of cages");
              String inputnbr = scan.nextLine();
              if (!inputnbr.isEmpty()) {
                  System.out.println("Error: number of cages cannot be empty.");
              } else {
                  System.out.println("Erreur : saisissez uniquement des chiffres (ex: 20).");

              }
          }


      }
    }

