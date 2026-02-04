package lab4.oop.exercise.composition.bookauthorarray;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    int qty = 0;
    public Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    public Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    public String getName(){
        return name;
    }
    public Author[] getAuthors(){
        return authors;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    @Override
    public String toString() {
        String authorStr = "{";
        for(int i = 0; i < authors.length; i++){
            authorStr += authors[i];
            if(i < authors.length -1){
                authorStr += ", ";
            }
        }
        authorStr+="}";
        return "Book[name=" + name +
                ", author=" + authorStr +
                ", price=" + price +
                ", qty=" + qty + "]";
    }

}
