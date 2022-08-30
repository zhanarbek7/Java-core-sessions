package enumsExceptions.ozubuzdunException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age<15){
            try {
                throw new AgeException();

            } catch (AgeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
