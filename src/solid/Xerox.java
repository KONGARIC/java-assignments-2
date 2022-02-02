package solid;

public class Xerox implements Printer{
    private int cost=1;
    Money obj=new CalculateMoney();
    @Override
    public void print()
    {
        System.out.println("xerox");
        obj.addMoney(cost);
    }
    /*
    public void calculateCost()
    {
        obj.addMoney(cost);
    }*/
}
