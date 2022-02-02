package Java.assignment6;

public class Four {

    public Four(String name){
        System.out.print(name+" ");
    }

    public static void main(String []args){
        System.out.print("NAME: ");
        Four[] four=new Four[3];
        four[0]=new Four("Kongari");
        four[1]=new Four("Chandra");
        four[2]=new Four("Shekar");
    }
}
