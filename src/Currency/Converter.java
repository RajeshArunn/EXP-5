package Currency;
public class Converter 
{
    public double DollartoRupee(double x)
    {
        double y=79.71*x;
        return y;
    }
    public double EurotoRupee(double x)
    {
        double y=79.80*x;
        return y;
    }
    public double YentoRupee(double x)
    {
        double y=0.55*x;
        return y;
    }
    public double RupeetoDollar(double x)
    {
        double y=x/79.71;
        return y;
    }
    public double RupeetoEuro(double x)
    {
        double y=x/79.80;
        return y;
    }
    public double RupeetoYen(double x)
    {
        double y=x/0.55;
        return y;
    }    
}
