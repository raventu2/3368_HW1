package homework1;

public class Mazda extends Vehicle implements StreetCarFunctionalities
{
    Mazda(double p, String m, int g)
    {
        super(p, m, g);
        m = "Mazda5";
    }

    public String superEconomic(String supEco)
    {
        return "Most economical car in my garage.";
    }

    @Override
    public void start_engine() {

    }

    @Override
    public void drive() {

    }

    //interface
}
