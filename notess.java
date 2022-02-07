

public class notess { 
    public static void main(String args[]) {
      Point n = new Point(3, 1);
      Point temp = new Point(2,4);
      n.functionB(temp);
      System.out.println("n.myX = " + n.getMyX());

    }
}
class Point
{
  private int myX;
  private int myY;
  public Point(int x, int y)
  {
    myX = x;
    myY = y;

  }
  public void functionB(Point n)
  {
    myX +=n.myX;
    myY += n.myY;

  }
  public int getMyX()
  {
    return myX;
  }

  public void setMyX(int v)
  {
    myX = v;
  }
  
  
}