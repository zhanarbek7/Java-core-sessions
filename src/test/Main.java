package test;

import test.dao.Dao;
import test.enums.Gender;
import test.model.Book;
import test.model.Library;
import test.model.LibraryMember;
import test.service.impl.LibraryServiceImpl;

import java.util.Scanner;

public class Main {
    static Scanner scannerN = new Scanner(System.in);
    static Scanner scannerS = new Scanner(System.in);
    public static void main(String[] args) {
        Dao dao = new Dao(new Library());
        LibraryServiceImpl libraryService = new LibraryServiceImpl(dao);
        while(true){
            buttons();
            System.out.print("Выберите: ");
            switch (scannerS.nextLine()){
                case "1" -> {
                    LibraryMember libraryMember = new LibraryMember();
                    System.out.println("---Введите данные---");
                    System.out.print("Введите id участника: ");
                    libraryMember.setMemberId(scannerN.nextLong());
                    System.out.print("Введите имя участника: ");
                    libraryMember.setName(scannerS.nextLine());
                    libraryService.addLibraryMember(libraryMember);
                }
                case "2" -> {
                    System.out.println("---------------------");
                    libraryService.getLibraryMembers().forEach(x->{
                        System.out.println("ID: "+x.getMemberId());
                        System.out.println("Имя: "+x.getName());
                        System.out.println("---------------------");
                    });
                }
                case "3" -> {
                    System.out.print("\nВведите ID: ");
                    Long id = scannerN.nextLong();
                    LibraryMember libraryMember = libraryService.findLibraryMemberById(id);
                    if(libraryMember == null) System.out.println("Пользователя с ID "+ id + " не существует!\n");
                    else{
                        System.out.println("---------------------");
                        System.out.println("ID: "+libraryMember.getMemberId());
                        System.out.println("Имя: "+libraryMember.getName());
                        if(libraryMember.getCurrentlyReading()==null) System.out.println("Читаемая книга: пусто");
                        else System.out.println("Читаемая книга: "+libraryMember.getCurrentlyReading().getTitle());
                        System.out.println("Прочитанные книги: ");
                        for (Book i: libraryMember.getFinishedBooks()) {
                            System.out.println("Название книги: "+i.getTitle());
                        }
                        System.out.println("---------------------");
                    }
                }
                case "4" -> {
                    System.out.print("\nВведите ID: ");
                    libraryService.deleteLibraryMemberByID(scannerN.nextLong());
                }
                case "5" -> {
                    Book book = new Book();
                    System.out.print("Введите ID книги: ");
                    book.setBookId(scannerN.nextLong());
                    System.out.print("Введите название книги: ");
                    book.setTitle(scannerS.nextLine());
                    libraryService.addBookToLibrary(book);}
                case "6" -> {
                    System.out.println("---------------------");
                    libraryService.getLibraryBooks().forEach(x->{
                    System.out.println("ID: "+x.getBookId());
                    System.out.println("Название: "+x.getTitle());
                    if(x.getCurrentHolder()==null) System.out.println("Владелец: пусто");
                    else System.out.println("Владелец: "+x.getCurrentHolder());
                    System.out.println("Статус: "+x.getStatus());
                    System.out.println("---------------------");
                });}
                case "7" -> {
                    System.out.print("\nВведите ID: ");
                    Long id = scannerN.nextLong();
                    Book libraryBookById = libraryService.findLibraryBookById(id);
                    if(libraryBookById == null) System.out.println("Книга с ID "+ id + " не существует!\n");
                    else{
                        System.out.println("--------------------");
                        System.out.println("ID: "+libraryBookById.getBookId());
                        System.out.println("Название: "+libraryBookById.getTitle());
                        System.out.println("Владелец: "+libraryBookById.getCurrentHolder());
                        System.out.println("Статус: "+libraryBookById.getStatus());
                        System.out.println("---------------------");
                    }
                }
                case "8" -> {
                    System.out.print("\nВведите ID: ");
                    libraryService.deleteLibraryBookByID(scannerN.nextLong());}
                case "9" -> libraryService.addBookToMember();
                case "10" -> libraryService.removeBookFromReading();
                case "x" -> System.exit(0);
            }
        }
    }

    public static void  buttons(){
        System.out.println();
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("Нажмите 1, чтобы добавить нового участника в библиотеку.");
        System.out.println("Нажмите 2, чтобы увидеть всех участников библиотеки.");
        System.out.println("Нажмите 3, чтобы найти участника по ID и увидеть данные участника, читаемая книга и прочитанные.");
        System.out.println("Нажмите 4, чтобы удалить участника по ID.");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("Нажмите 5, чтобы добавить книгу в библиотеку.");
        System.out.println("Нажмите 6, чтобы увидеть все книги в библиотеке.");
        System.out.println("Нажмите 7, чтобы найти книгу по ID.");
        System.out.println("Нажмите 8, чтобы удалить книгу по ID.");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("Нажмите 9, чтобы ввести memberId участника и bookId книги, добавить в читаемые");
        System.out.println("Нажмите 10, чтобы ввести memberId участника и bookId книги, добавить в прочитанные");
        System.out.println("Нажмите x, чтобы завершить программу.");
    }
}
