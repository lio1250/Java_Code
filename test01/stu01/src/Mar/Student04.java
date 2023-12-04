package Mar;

public class Student04 {
    private String sno;
    private String name;
    private String major;
    private char gender;
    private int age;
    //公有化方法

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student04(String sno, String name, String major){
        this.sno = sno;
        this.name = name;
        this.major = major;
    }
    public Student04(String sno,String name,String major,int age){
        this(sno, name, major);
        this.age = age;
    }
    public Student04(String sno,String name,String major,char gender,int age){
        this(sno, name, major,age);
        this.gender = gender;
    }
    public String toString(){
        return "学号："+this.sno+"\n"+"姓名："+this.name+"\n"+"专业："
                +this.major+"\n"+"年龄："+this.age+"\n"+"性别："
                +this.gender+'\n';
    }

}

