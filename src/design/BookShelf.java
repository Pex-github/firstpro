package design;

public class BookShelf implements Aggregate {

    private Book[] books;

    /*
     * 优化Books结构，将数组改为ArrayList
     * */

//    private ArrayList bookArrayList;
//    public BookShelf(int initialSize){
//        this.bookArrayList = new ArrayList(initialSize);
//    }
//    public Book getBookFromArrayList(int index){
//        return (Book) bookArrayList.get(index);
//    }
//    public boolean appendBookArrayList(Book book){
//        return bookArrayList.add(book);
//    }
//    public int getArrayListLength(){
//        return bookArrayList.size();
//    }


    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }


    public int getLength() {
        return last;
    }

    @Override
    public Iterator1 iterator() {
        return new BookShelfIterator(this);
    }
}
