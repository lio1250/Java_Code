public class Book {
    //1、私有化成员变量
    private String bookname;
    private String author;
    private String press;
    private String isbn;
    private double price;
    public static int count;
    //2、公有化方法：提供私有化成员变量和对应的set（）和get（）方法
    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //3、构造器：为创建对象初始化（为创建对象提供构造方法）
    public Book() {
        count ++;
    }

    public Book(String bookname, String author, String press, String isbn, double price) {
        this.bookname = bookname;
        this.author = author;
        this.press = press;
        this.isbn = isbn;
        this.price = price;
    }
    //4、静态方法display
    public static void display(Book bk) {
        System.out.println("\n书名：" + bk.getBookname() +
                "\n作者：" + bk.getAuthor() +
                "\n出版社：" + bk.getPress() +
                "\n书号：" + bk.getIsbn() +
                "\n价格：" + bk.getPrice());
    }
}
