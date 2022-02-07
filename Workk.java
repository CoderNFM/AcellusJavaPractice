import java.util.ArrayList;
public class Workk {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        int num = 0;
        while(num < 10)
        {
            list.add(new Integer(num*2-1));
            num ++;
        }
        list.remove(4);
        list.add(new Integer(7));
        list.add(list.size()/2,list.get(1));
        list.add(1,11);
        list.remove(11);
        
        System.out.println(list);
        System.out.println(list.size());

    }
}
