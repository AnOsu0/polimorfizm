package example1;

import javax.swing.*;
import java.util.Scanner;

public class Hospital {
    private static int personNumber = 0;
    final static private int DOCTOR = 1;
    final static private int NURSE = 2;
    private static int personType = 5;
    static Scanner sc = new Scanner(System.in);
    private static int temp = 3;

    public static void makeArray (){
        System.out.println("Ilu pracowników chcesz wprowadzić?");
        temp = sc.nextInt();
    }
    private static Person[] persons = new Person[temp];

    public static void addPersons() {
        for (int i = 0; i < persons.length; i++) {
            System.out.println("Wybierz typ: ");
            System.out.println("1 - Doktor");
            System.out.println("2 - pielęgniarka");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case DOCTOR:
                    System.out.println("podaj Imię:");
                    String firstName = sc.nextLine();
                    System.out.println("Podaj Nazwisko:");
                    String lastName = sc.nextLine();
                    System.out.println("Podaj pensję:");
                    double salary = sc.nextDouble();
                    System.out.println("Podaj premię:");
                    double bonus = sc.nextDouble();
                    sc.nextLine();
                    persons[i] = new Doctor(firstName, lastName, salary, bonus);
                    break;
                case NURSE:
                    System.out.println("podaj Imię:");
                    String firstName1 = sc.nextLine();
                    System.out.println("Podaj Nazwisko:");
                    String lastName1 = sc.nextLine();
                    System.out.println("Podaj pensję:");
                    double salary1 = sc.nextDouble();
                    System.out.println("Podaj ilość nadgodzin");
                    double overtime = sc.nextDouble();
                    sc.nextLine();
                    persons[i] = new Nurse(firstName1, lastName1, salary1, overtime);
                    break;
                default:
                    System.out.println("nieprprawny wybór");

            }

        }

    }
     public static void getIno(){
         System.out.println("Pracownicy szpitala: ");
        for (Person person: persons) {
            if (person instanceof Nurse) {
                System.out.println("Imię: " + person.getFirstName() + ", Nazwisko: " + person.getLastName()
                        + ", pensja: " + person.getSalary() + ", nadgodziny: "
                        + ((Nurse) person).getOvertime());
            } else if (person instanceof Doctor){
                System.out.println("Imię: " + person.getFirstName() + ", Nazwisko: " + person.getLastName()
                        + ", pensja: " + person.getSalary() + ", nadgodziny: "
                        + ((Doctor) person).getBonus());
            }
        }
     }

}
