package sessions.stringsFiles.tapshyrma2;

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
        Scanner scannerW = new Scanner(System.in);
        FileWriter fileWriter = new FileWriter(fileName);
        System.out.print("Созду жазыныз: ");
        String word = scanner.nextLine();
        System.out.print("Созду канча жолу жазыш керек: ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            fileWriter.write(word+"\n");
        }
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
