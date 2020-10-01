package homework1;

public class Vehicle
{
    private double price;
    private String model;
    private int gears;

    Vehicle(double p, String m,int g)
    {
        price = p;
        model = m;
        gears = g;
    }

    public double getPrice()
    {
        return price;
    }

    public String getModel()
    {
        return model;
    }

    public int getGears()
    {
        return gears;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setGears(int gears)
    {
        this.gears = gears;
    }

}
