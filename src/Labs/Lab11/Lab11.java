package Labs.Lab11;

public class Lab11 {
    public static void main(String[] args){
        Book books[] = new Book[3];
        books[0] = new Book("The Cold Brew Coffee","Iced tea");
        books[1] = new Book("Lord of the Ring", "J.R.R. Tolkien");
        books[2] = new Book("The Licking Cat","Baby Timothy - The Devil Baby");

        System.out.println(books[0].toString());
        System.out.println(books[1].toString());
        System.out.println(books[2].toString());
        System.out.println();

        Bookshelf bookshelf = new Bookshelf(3);
        bookshelf.addBook(books[0]);
        bookshelf.addBook(books[1]);
        bookshelf.addBook(books[2]);
        for(Book elem: bookshelf.getBooks()){
            System.out.println(elem.toString());
        }

        bookshelf.emptyBookshelf();
        for(Book elem: bookshelf.getBooks()){
            System.out.println(elem.toString());
        }

    }
}
