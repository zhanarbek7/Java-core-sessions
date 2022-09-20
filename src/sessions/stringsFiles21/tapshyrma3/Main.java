package sessions.stringsFiles21.tapshyrma3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Файлдын атын жазыныз: ");
        String fileName = scanner.nextLine();
        System.out.println(getChangedLyrics(fileName));
    }

    public static String getChangedLyrics(String fileName) throws FileNotFoundException {
        StringBuilder stringBuilder = new StringBuilder();
        FileReader fileReader = new FileReader(fileName);
        Scanner scanner = new Scanner(fileReader);
        int i = 0;
        while(scanner.hasNextLine()){
            if(i == 1){
                i=0;
                scanner.nextLine();
                continue;
            }
            i++;
            stringBuilder.append(scanner.nextLine()).append("\n");
        }
        return stringBuilder.toString();
    }

}
