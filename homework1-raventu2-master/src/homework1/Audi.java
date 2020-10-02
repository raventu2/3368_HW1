package homework1;

public class Audi extends Vehicle implements RaceCarFunctionalities
{
    public Audi(double p, String m, int g)
    {
        super(p, m, g);
        m = "Audi TT";
    }

    //interface

    @Override
    public void warmup_engine() {

    }

    @Override
    public void move_to_start() {

    }

    @Override
    public void race() {

    }
}