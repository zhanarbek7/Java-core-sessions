package sessions.enumsExceptions19n20.tapshyrma3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[5];
        for (int i = 0; i<arr.length; i++){
            System.out.print("Индекс i = "+i+" санын жазыныз ");
            arr[i] = scanner.nextInt();
            System.out.println();
        }

        try{
            throw new ArrayIndexOutOfBoundsException("Сиз массивтин чегинен чыгып кеттиниз");

        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Hello world!");
        }
    }
}
