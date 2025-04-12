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
        double res = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        res += (50 - z1) + (50 - z2);
        return res;
    }
    public static void main(String[] args) {
        
    }
}