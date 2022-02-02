package Java.assigment5.data;

public class ClassOne {
    int integer;
    char character;

    public void printVariables(){
        System.out.println("Integer: "+integer);
        System.out.println("Character: "+character);
    }

    public void print(){
        /*int value;
        char ch;
         //here printing is not possible without the initialization of local variables
        */
        int value=10;
        char ch='S';
        System.out.println("Value :"+value);
        System.out.println("Ch: "+ch);

    }
}
