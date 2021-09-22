package by.tsvirko.tasks.lesson5.task4;

public class Reader {

    private String fio;
    private int readerNumber;
    private String faculty;
    private int birthday;
    private int phoneNumder;

    public Reader(String fio, int readerNumber, String faculty, int birthday, int phoneNumder) {
        this.fio = fio;
        this.readerNumber = readerNumber;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phoneNumder = phoneNumder;
    }

    public Reader() {
    }

    public Reader(String fio) {
        this.fio = fio;
    }

    public static void main(String[] args) {

        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Петров В.В.");
        readers[1] = new Reader("Мухина О.Н.");
        readers[2] = new Reader("Шишкина К.Р.");
        Book[] books = new Book[3];
        books[0] = new Book("Робинзон Крузо", "Даниель Дефо");
        books[1] = new Book("Словарь", "Кузнецов С.А");
        books[2] = new Book("Энциклопедия", "Кондрашов А.П.");
        readers[0].takeBook(books[1], books[2]);
        readers[2].returnBook(books);
    }

    public void takeBook(Book... books) {

        System.out.println(this.fio + " взял книги:");
        for (Book book : books) {
            System.out.println(book.getNameBook() + ", автор - " + book.getAuthorBook());
        }
    }

    public void returnBook(Book... books) {

        System.out.println(this.fio + " вернул следующие книги:");
        for (Book book : books) {
            System.out.println(book.getNameBook() + ", автор - " + book.getAuthorBook());
        }
    }
}

