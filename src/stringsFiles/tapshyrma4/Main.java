package stringsFiles.tapshyrma4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        startChat();

        read("chat.txt");

    }

    public static void startChat() throws IOException {
        Scanner scanner = new Scanner(System.in);
        StringBuilder word;
        FileWriter fileWriter = new FileWriter("chat.txt");
        int aliceCounter = 0, johnCounter = 0;

        while(true){
            System.out.print("Alice: ");
            word = new StringBuilder(scanner.nextLine());
            if(word.toString().equals("x")){
                break;
            }
            fileWriter.write("Alice: "+word+"\n");
            aliceCounter++;

            System.out.print("John: ");
            word = new StringBuilder(scanner.nextLine());
            if(word.toString().equals("x")){
                break;
            }
            fileWriter.write("John: "+word+"\n");
            johnCounter++;

        }
        fileWriter.close();
        System.out.println("---MESSAGES---");
        System.out.println("ALICE messages size = " + aliceCounter);
        System.out.println("JOHN messages size = " + johnCounter);
        System.out.println("--------------");
    }
    public static void read(String name) throws IOException {
        FileReader fileReader = new FileReader(name);
        Scanner scanner = new Scanner(fileReader);
        int i = 0;
        while(scanner.hasNextLine()){

            System.out.println(scanner.nextLine());
        }
        fileReader.close();
    }
}
