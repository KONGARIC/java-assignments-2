package solid;

public class BuyRoughBooks implements BuyBooks {
    private int cost=20;
    Money obj=new CalculateMoney();
    public void howMany(int n)
    {
        cost=cost*n;
        System.out.println("How many: "+n);
        obj.addMoney(cost);

    }

    @Override
    public void bookType()
    {

        System.out.println("Rough book");
    }
    @Override
    public void buy()
    {
        System.out.println("buying  books");

    }
    public void paperType()
    {
        System.out.println("Normal white");
    }

    /*public void CalculateCost()
    {
        System.out.println(cost+ " before ading");

    }*/

}
