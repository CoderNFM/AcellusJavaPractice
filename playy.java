public class playy {
    public static void main(String[] args) {
        String t = "again";
        String u =new String("again");
        String v = "gain";
        String w = "gain";

        if (t.compareTo(u)==0)
        {
            if(v.compareTo(w)!=0)
            {
                System.out.println("Bubble A");

            }
            else
            {
                System.out.println("bubble b");
            }
        }
        else
        {
            if(v.compareTo(w)!= 0)
            {
                System.out.println("bubble c");
            }
            else
            {
                System.out.println("x");
            }
        }

    }
}
