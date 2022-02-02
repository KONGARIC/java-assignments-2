package WithoutSolid;



public class BuyItems implements Items{
    private int cost=20;
    CalculateMoney obj=new CalculateMoney();
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

}
