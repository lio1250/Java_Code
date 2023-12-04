public class BookTest {
    public static void main(String[] args){
        //1、调用带参构造器创建对象
        Book bk1=new Book("Java核心编程技术",
        "张歧","大连理工大学出版社", "978-7-5611-5767-1", 45.0);
        //使用访问器getXxx（）读取书籍信息
        System.out.println("书名："+bk1.getBookname());
        System.out.println("作者："+bk1.getAuthor());
        System.out.println("出版社："+bk1.getPress());
        System.out.println("书号："+bk1.getIsbn());
        System.out.println("价格："+bk1.getPrice());
        //使用设置器setXxx（）修改图书价格、出版社
        bk1.setPrice(50.0f);
        bk1.setPress("人民邮电出版社");
        System.out.println("\n修改后的书价："+ bk1.getPrice());
        //调用类外静态方法输出bk1书籍信息
        Book.display(bk1);
    }
}
