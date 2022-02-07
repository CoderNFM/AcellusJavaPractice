import java.util.ArrayList;
import java.util.List;

public class expressionss {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        int num = 0;
        while (num<= 11)
        {
            list.add(new Integer(3*num-2));
            num++;
        }
        list.add(list.get(5));
        list.remove(2);
        list.remove(new Integer(7));
        list.remove(6);
        System.out.println(list.get(6).equals(new Integer(25)));
        System.out.println(list.get(5).compareTo(list.get(4))>0);
        System.out.println(list.get(list.size()-1)==list.get(3));

    }
}
