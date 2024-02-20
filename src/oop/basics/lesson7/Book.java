package oop.basics.lesson7;

public class Book {
    String name;
    String author;
    int quantityOfPages;
    boolean isDocumentary;

    public Book(String name, String author, int quantityOfPages, boolean isDocumentary) {
        this.name = name;
        this.author = author;
        this.quantityOfPages = quantityOfPages;
        this.isDocumentary = isDocumentary;
    }

    public void quantityOfStringsInBook() {
        System.out.println("Количество строк в книге: " + this.quantityOfPages * 40);
    }
    public void quantityOfStringsInBook(int quantityOfStringsOnPage) {
        System.out.println("Количество строк в книге: " + this.quantityOfPages * quantityOfStringsOnPage);
    }

    public void Info() {
        System.out.printf("%s от %s - %s", name, author, isDocumentary ? "Документальная" : "Недокументальная");
    }


}
