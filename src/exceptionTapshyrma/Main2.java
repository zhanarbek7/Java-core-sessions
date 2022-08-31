package exceptionTapshyrma;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите количество работников: ");
        Employee[] employees = new Employee[scanner.nextInt()];
        scanner.nextLine();

        for (int i = 0; i < employees.length; i++){
            employees[i] = new Employee();
            String firstName = writeName(i,"имя");
            String lastName = writeName(i,"фамилия");
            int yearOfBirth = writeYear(i);

            employees[i].setFirstName(firstName);
            employees[i].setLastName(lastName);
            employees[i].setYearOfBirth(yearOfBirth);


        }


        for (Employee i: employees) {
            System.out.println(i.getFirstName());
            System.out.println(i.getLastName());
            System.out.println(i.getYearOfBirth());
        }
    }

    public static boolean checkName(String name){
        int counter = 0;
        for(int i = 0; i< name.length(); i++){
            if(Character.isLetter(name.charAt(i))){
                counter++;
            }
        }
        return name.length() != counter;
    }

    public static String writeName(int i, String word){

        i++;
        System.out.printf("Введите %s работника %d: ",word, i);
        String name = scanner.nextLine();
        try{
            if(checkName(name)){
                throw new MyException();
            }

        } catch (MyException e) {
            while(checkName(name)){
                System.out.printf("Вы ввели %s %d неправильно\n", word, i);
                System.out.printf("Введите %s %d: ",word, i);
                name = scanner.nextLine();
            }
        }
        return name;
    }

    public static int writeYear(int i){



        i++;
        while(true){
            try{
                System.out.printf("Введите год рождения #%d работника: ",i);
                int year = scanner.nextInt();
                if((LocalDateTime.now().getYear()-year>0)
                        && (year>1950)){
                    scanner.nextLine();
                    return year;
                }
                throw new MyException();

            }
            catch(Exception e){
                scanner.nextLine();
                System.out.printf("Вы ввели год рождения #%d работника" +
                        " неправильно\n",i);
            }
        }
    }

}
