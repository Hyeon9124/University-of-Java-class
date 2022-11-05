package Midterm_exam_5;
import java.util.Arrays;
public class SortingBook {
    public static void main(String[] args) {
        Book[] books = new Book[]{new Book(15000), new Book(30000), new Book(25000)};

        System.out.println("[Before Sorting]");
        for(Book before : books){
            before.show();
        }
        System.out.println();

        Arrays.sort(books);

        System.out.println("[After Sorting]");
        for(Book after : books){
            after.show();
        }
    }
}