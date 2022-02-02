package solid;

public class ColorPrint implements Printer{
    private int cost=10;
    Money obj=new CalculateMoney();
    @Override
    public void print()
    {
        System.out.println("Color Print");
        obj.addMoney(cost);
    }

    //public void calculateCost()
    //{
      //  obj.addMoney(cost);
    //}
}
