package Midterm_exam_5;

public class Book implements Comparable<Book>{
    int price;

    public Book(int price) {  // Constructor
        this.price = price; // field 초기화
    }

    @Override
    public int compareTo(Book obj) {
        Book book = (Book) obj;
        return Integer.compare(this.price, book.price);
    }

    void show(){
        System.out.println("Book [가격=" + price + "]");
    }
}