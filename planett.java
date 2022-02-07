public class planett {
    private int mySize;
    private double myDistance;
    public planett()
    {
        mySize = 0;
        myDistance = 0;
    }

    public planett(int s, double d, String n)
    {
        mySize = s;
        myDistance = d;
    }
    
    public double getDistance()
    {
        return myDistance;

    }

    public double getInfo()
    {
        return mySize / 2. + myDistance;
    }


}
