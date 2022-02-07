

public class HelloWorld { 
    public static void main(String args[]) {
      ClassA n = new ClassA(11, 0);
      ClassA temp = new ClassA(-3,9);
      n.methodB(temp);
      System.out.println("n.myValue = " + n.getMyNum2());

    }
}
class ClassA
{
  private int myNum1;
  private int myNum2;
  public ClassA(int x, int y)
  {
    myNum1 = x;
    myNum2 = y;

  }
  public void methodB(ClassA c)
  {
    myNum2 = c.getMyNum2();
    c.setMyNum2(getMyNum1()+1);
    myNum1 +=3;
    
    

  }
  public int getMyNum1()
  {
    return myNum1;
  }

  public int getMyNum2()
  {
    return myNum2;
  }
  
  public void setMyNum2(int v)
  {
    myNum2 = v;
  }
}