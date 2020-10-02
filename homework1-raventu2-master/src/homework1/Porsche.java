package homework1;

public class Porsche extends Vehicle implements RaceCarFunctionalities
{
    public Porsche(double p, String m, int g)
    {
        super(p, m, g);
    }

    public String superService(String supServ)
    {
        return "I need this every three months";
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
