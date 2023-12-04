public class BookTest2 {
    public static void main(String[] args){
        //1、调用带参构造器创建对象
        Book bk2=new Book("Python程序设计基础",
                "张三","人民邮电出版社", "978-7-5611-5799-2", 99.0);
        //使用访问器getXxx（）读取书籍信息
        System.out.println("书名："+bk2.getBookname());
        System.out.println("作者："+bk2.getAuthor());
        System.out.println("出版社："+bk2.getPress());
        System.out.println("书号："+bk2.getIsbn());
        System.out.println("价格："+bk2.getPrice());

        //调用类外静态方法输出bk2书籍信息
        Book.display(bk2);
        //调用类外静态变量count
        System.out.println("数量："+bk2.count);
    }
}
