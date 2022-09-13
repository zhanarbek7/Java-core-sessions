package sessions.enumsExceptions.tapshyrma2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ageCheck(scanner.nextInt());
    }
    public static void ageCheck(int age){
        try{
            if(age<18){
                throw new ArithmeticException("Zhashy 18den kichine");
            }
            System.out.println(age);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }


}

