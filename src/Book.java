//7 - Faça um programa para controle de empréstimo de livros, com os atributos
//Empréstimo, Livro e Pessoa.
import java.time.LocalDate;
public class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true; // New books are initially available
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
class Person {
    private String name;
    private int age;
    private String contactInfo;

    public Person(String name, int age, String contactInfo) {
        this.name = name;
        this.age = age;
        this.contactInfo = contactInfo;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
class Loan {
    private Book book;
    private Person person;
    private LocalDate loanDate;
    private LocalDate dueDate;
    private boolean returned;

    public Loan(Book book, Person person, LocalDate loanDate, LocalDate dueDate) {
        this.book = book;
        this.person = person;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.returned = false; // Loan starts with book not returned
    }

    // Getters and Setters
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }
}
