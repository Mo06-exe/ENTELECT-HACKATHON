import java.util.ArrayList;

public class distance {
    public static double d(ArrayList<Integer> p1, ArrayList<Integer> p2) {
        int x1, y1, x2, y2, z2, z1;
        x1 = p1.get(0);
        x2 = p2.get(0);

        y1 = p1.get(1);
        y2 = p2.get(1);

        z1 = p1.get(2);
        z2 = p2.get(2);
        double res = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        res += (50 - z1) + (50 - z2);
        return res;
    }
    public static void main(String[] args) {
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();

        p1.add(8);
        p1.add(10);
        p1.add(10);

        p2.add(6);
        p2.add(9);
        p2.add(2);

        System.out.println(d(p1, p2));
        

    }
}