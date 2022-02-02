package Java.assigment5.singleton;

public class ClassTwo {
    /*String name;
    here the String should be declared static as static method can only contain static members.
    */
    String name;
    public ClassTwo(String name)
    {
        this.name=name;
    }

    public static ClassTwo print(String name)
    {
       // this.name=name; here the static method cannot contain or initialize the non-static variables.
        return new ClassTwo(name);
    }

    public void printString(){
        System.out.print(name);
    }

}
