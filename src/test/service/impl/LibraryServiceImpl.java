package test.service.impl;

import test.enums.Gender;
import test.enums.Status;
import test.model.Book;
import test.model.LibraryMember;
import test.dao.Dao;
import test.service.LibraryService;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class LibraryServiceImpl implements LibraryService {
    private static final Scanner scannerN = new Scanner(System.in);
    private Dao dao;

    public LibraryServiceImpl(Dao dao) {
        this.dao = dao;
    }

    @Override
    public List<LibraryMember> getLibraryMembers() {
        return dao.getLibrary().getLibraryMembers();
    }

    @Override
    public void addLibraryMember(LibraryMember member) {
        dao.getLibrary().getLibraryMembers().add(member);
    }

    @Override
    public LibraryMember findLibraryMemberById(Long id) {
        Optional<LibraryMember> first = dao.getLibrary().getLibraryMembers().stream().filter(x -> x.getMemberId().equals(id)).findFirst();
        return first.orElse(null);
    }

    @Override
    public void deleteLibraryMemberByID(Long id) {
        dao.getLibrary().getLibraryMembers().stream()
                .filter(x->x.getMemberId().equals(id))
                .findFirst()
                .ifPresent(libraryMember -> {
                            dao.getLibrary().getLibraryMembers().remove(libraryMember);
                            System.out.println("Пользователь с ID "+ id + " удалён!\n");
                        });
    }

    @Override
    public void addBookToLibrary(Book book) {
        dao.getLibrary().getBooks().add(book);
    }

    @Override
    public List<Book> getLibraryBooks() {
        return dao.getLibrary().getBooks();
    }

    @Override
    public void deleteLibraryBookByID(Long id) {
        dao.getLibrary().getBooks().stream()
                .filter(x->x.getBookId().equals(id))
                .findFirst()
                .ifPresent(libraryBook -> {
                            dao.getLibrary().getBooks().remove(libraryBook);
                        });
    }

    @Override
    public Book findLibraryBookById(Long id) {
        return dao.getLibrary().getBooks().stream().filter(x->x.getBookId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void addBookToMember() {
        System.out.print("Введите ID участника: ");
        Long memberId = scannerN.nextLong();
        LibraryMember member = findLibraryMemberById(memberId);
        if (member==null) System.out.println("Пользователя с ID "+ memberId + " не существует!");
        if(member!=null){
            System.out.print("Введите ID книги: ");
            Long bookId = scannerN.nextLong();
            Book book = findLibraryBookById(bookId);
            if (book==null) System.out.println("Книга с ID "+ memberId + " не существует!");
            else{
                if (book.getStatus().equals(Status.BUSY)&& member.getCurrentlyReading()!=null){
                    System.out.println("Мы не можем добавить книгу в читаемые так как: ");
                    System.out.println("Книгой пользуется участник с ID "+book.getCurrentHolder().getMemberId());
                    System.out.println("А данный участник "+ member.getName()+" читает книгу "+member.getCurrentlyReading().getTitle());
                }
                else if(book.getStatus().equals(Status.BUSY)){
                    System.out.println("Мы не можем добавить книгу в читаемые так как: ");
                    System.out.println("Книгой пользуется участник с ID "+book.getCurrentHolder().getMemberId());
                }
                else if(member.getCurrentlyReading()!=null){
                    System.out.println("Мы не можем добавить книгу в читаемые так как: ");
                    System.out.println("А данный участник "+ member.getName()+" читает книгу "+member.getCurrentlyReading().getTitle());
                }
                else {
                    book.setCurrentHolder(member);
                    member.setCurrentlyReading(book);
                    deleteLibraryBookByID(bookId);
                    deleteLibraryMemberByID(memberId);
                    book.setStatus(Status.BUSY);
                    addBookToLibrary(book);
                    addLibraryMember(member);
                    System.out.println("Книга с ID "+ bookId+" добавлена в читаемые к "+member.getName());
                }
            }
        }
    }

    @Override
    public void removeBookFromReading(){
        System.out.print("Введите ID участника: ");
        Long memberId = scannerN.nextLong();
        LibraryMember member = findLibraryMemberById(memberId);
        if (member==null) System.out.println("Пользователя с ID "+ memberId + " не существует!");
        else {
            if(member.getCurrentlyReading()==null){
                System.out.println("У пользователя с ID "+ memberId + " нету читаемых книг!");
            }
            else{
                Book book = member.getCurrentlyReading();
                member.setCurrentlyReading(null);
                book.setAuthor("пусто");
                member.getFinishedBooks().add(book);
                book.setStatus(Status.AVAILABLE);
                deleteLibraryBookByID(book.getBookId());
                addBookToLibrary(book);
            }

        }
    }
}
