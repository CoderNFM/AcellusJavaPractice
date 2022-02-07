
public class codee {
    public static void main(String[] args) {
        int count =0;

        String s = "ALTITUDINARIAN";
        String t = "AGRARIAN";
        if(s.length()==t.length())
        {
            count++;
        }
        if(s.substring(9).equals(t.substring(3,t.length())))
        {
            count++;
        }
        if (s.substring(s.length()).length()==t.substring(7).length())
        {
            count++;
        }
        if(s.indexOf("TITI")<=0)
        {
            count++;
        }
        System.out.println(count);


    }
}
