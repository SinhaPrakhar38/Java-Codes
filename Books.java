
class Book {
    int bookNo;
    String bookName;
    int bookPrice;
    boolean purchase;

    public Book() {

    }

    public Book(int bookNo, String bookName, int bookPrice) {
        this.bookNo = bookNo;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.purchase = false;
    }

    public void display() {
        System.out.println(" Book no : " + bookNo + " Book name : " + bookName + " Book Price : " + bookPrice);

    }

    public void bookPurchase(boolean flag) {
        this.purchase = flag;
    }

    public void printBill(int no) {
        System.out.println("Bill is (Quantity * Price) : " + no * this.bookPrice);
    }
}

class SpecialEditionBook extends Book {

    double discount;

    public SpecialEditionBook(double discount, int bookNo, String bookName, int bookPrice) {
        this.discount = discount;
        this.bookNo = bookNo;
        this.bookName = bookName;
        this.bookPrice = bookPrice;

    }

    public void display() {
        System.out.println("Discount : " + discount + "  Book no : " + bookNo + "  Book name : " + bookName
                + "  Book Price : " + bookPrice);

    }

    public void printBill(int no) {
        System.out.println(" Bill is (Quantity * Price - Discount) : "
                + ((no * this.bookPrice) * this.discount));
    }
}

public class Books{
    public static void main(String[] args) {
        SpecialEditionBook b1 = new SpecialEditionBook(0.2, 101, "Why We Sleep", 452);
        b1.display();
        b1.bookPurchase(true);
        b1.printBill(2);
        Book b2 = new Book(102, "Rich Dad Poor Dad", 523);
        b2.display();
        b2.bookPurchase(true);
        b2.printBill(2);
    }
}
