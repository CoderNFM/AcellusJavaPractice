import java.util.ArrayList;
import java.util.List;

public class fragmentt {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        
        int num = 1;
        while(num <= 10)
        {
            list.add(num*num);
            num++;
        }
        list.remove(new Integer(16));
        list.remove(new Integer(64));
        System.out.println(list.get(0).equals(new Integer(1)));
        System.out.println(list.size()==0);
        System.out.println(list.get(3)== new Integer(25));



    }
}
