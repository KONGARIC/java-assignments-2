package Java.assignment6;

public class Second {

    public Second(String name){
        System.out.println("Constructor 1");
        System.out.println("Name: "+name);
    }

    public Second(String name,String rollNo){
        this(name);//calling constructor1
        System.out.println("Constructor 2");
        System.out.println("Roll No.: "+rollNo);
    }

    public static void main(String []args){
        Second object=new Second("Chandrashekar","21");
    }
}
