public class namee {
    public static void main(String[] args) {
        int[] id = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        String[] name = {"Joe","sue","ada","ivy","hal","job" };
        int[] num = {12,29,34,40,51,63,74};

        int n = (int)(Math.random()*12+3);

        System.out.println(id[n]+ " "+ name[n]+ " "+num[n]);
    }
}
