package sessions.stringsFiles.tapshyrma1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.print("Файлдын атын жазыныз: ");
        String fileName = scanner.nextLine();
        write(fileName);
        read(fileName);
    }

    public static void write(String fileName) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        System.out.print("Атынызды жазыныз: ");
        fileWriter.write("Hello, good morning "+scanner.nextLine()+"!");
        fileWriter.close();
    }

    public static void read(String fileName) throws FileNotFoundException {
        FileReader fileReader = new FileReader(fileName);
        Scanner scanner = new Scanner(fileReader);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }
}
