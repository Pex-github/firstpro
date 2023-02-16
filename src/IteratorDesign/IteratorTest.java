package IteratorDesign;


/*
 * 迭代器模式学习
 * 两个接口，两个实现类，一个实体类
 * 迭代器接口+迭代器实现   iterator1 + bookShelfIterator
 * 集合接口+集合实现类     Aggregate + bookShelf
 * 实体类                book
 *
 * 集合接口中，创建了一个方法，用于返回一个迭代器
 * 具体的集合实现类，提供了创建具体迭代器的方法，将自己作为属性传给了具体的迭代器。bookshelf.iterator();
 * 迭代器接口，hasNext，next方法
 * 具体的迭代器，实现了接口，同时还聚合了（包含了）具体集合实现类[书架]
 * 详见：图解设计模式，p8
 * 图很重要，建议记忆
 * 不要使用具体的类来编程，会造成类之间的强耦合，不利于组件的再次利用
 * 要优先使用抽象类和接口来编程
 * */
public class IteratorTest {

    public static void main(String[] args) {

        BookShelf bookShelf;
        bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("精神现象学"));
        bookShelf.appendBook(new Book("纯粹理性批判"));
        bookShelf.appendBook(new Book("逻辑学"));
        bookShelf.appendBook(new Book("法哲学原理"));
        Iterator1 iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
