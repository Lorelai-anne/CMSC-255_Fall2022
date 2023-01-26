package Labs.Lab11;

import java.util.ArrayList;
public class Bookshelf {
    private int size;
    private ArrayList<Book> books;

    public Bookshelf(){
        size = 2;
        books = new ArrayList<>();
    }
    public Bookshelf(int size){
        this.size = size;
        books = new ArrayList<>();
    }

    /**
     * these methods return and update
     * the variables size and book
     * @return - returns the variables size and books
     */
    public int getSize(){
        return size;
    }
    public ArrayList<Book> getBooks (){
        return books;
    }

    /**
     * this method adds a book to the bookshelf
     * or the arrayList books if there is any room
     * @param newBook - book parameter to the Book arraylist
     */
    public void addBook(Book newBook){
        if(books != null){
            books.add(newBook);
        }
    }

    /**
     * this method removes the first book
     * on the bookshelf arraylist and returns it
     * if there are no books in the arraylist it will return
     * a null value
     */
    public ArrayList<Book> removeBook (){
        if (!books.isEmpty()){
            books.remove(0);
        }else{
            books = null;
        }
        return books;
    }

    /**
     * this method empties the books
     * arraylist
     */
    public void emptyBookshelf(){
        books.clear();
    }
}
