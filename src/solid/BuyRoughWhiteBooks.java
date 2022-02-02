package solid;

public class BuyRoughWhiteBooks extends BuyRoughBooks{
    int cost =40;

    Money obj=new CalculateMoney();
    public void paperType(String str)
    {
        System.out.println("White rough book");
    }
    public void howMany(int n)
    {
        cost=cost*n;
        System.out.println("How many: "+n);
        obj.addMoney(cost);

    }
    /*
    public void calculateCost()
    {
        System.out.println(cost);

    }*/
}
