package test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        FileWriter writer = new FileWriter("hello.txt");
//        writer.write("Hello my friend!\n");
//        writer.write("I love you so.\n");
//        writer.write("Java forces.");
//        writer.close();
        FileReader reader = new FileReader("hello.txt");
        Scanner scanner = new Scanner(reader);

        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

        reader.close();
    }
}
