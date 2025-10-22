package tn.esprit.gestionZoo.main;

import tn.esprit.gestionZoo.entities.Zoo;

import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String zooName;
        String zooCity;
        int nbrCages = 0;

        while (true) {
            System.out.print("enter the name of the zoo: ");
            zooName = scan.nextLine();

            if (zooName.isEmpty()) {
                System.out.println(" zoo name cannot be empty");
            } else {
                break;
            }
        }

        while (true) {
            System.out.print("enter the city of the zoo: ");
            zooCity = scan.nextLine();

            if (zooCity.isEmpty()) {
                System.out.println(" city cannot be empty");
            } else {
                break;
            }
        }
        while (true) {
            System.out.print("enter the number of cages: ");
            String inputNbr = scan.nextLine();

            if (inputNbr.isEmpty()) {
                System.out.println(" number of cages cannot be empty ");
            }

            Zoo zoo = new Zoo(zooName, zooCity);
            zoo.nbrCages = nbrCages;


            System.out.println(" zoo created");
            zoo.displayZoo();

            scan.close();

        }
    }}