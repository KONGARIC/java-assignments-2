package solid;

public class CalculateMoney extends Money{
    @Override
    public void addMoney(int amount)
    {
        money=money+amount;
    }
    @Override
    public void subMoney(int amount)
    {
        money=money-amount;
    }

}
