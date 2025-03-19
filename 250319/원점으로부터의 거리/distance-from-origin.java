import java.util.Scanner;
import java.util.Arrays;

class Point implements Comparable<Point> {
    int dist;
    int index;

    public Point(int dist, int index){
        this.dist = dist;
        this.index = index;
    }

    @Override
    public int compareTo(Point point) {
        if(dist != point.dist)
            return dist - point.dist;
        return index - point.index;
    }
}

public class Main {
    public static final int MAXN = 1000;
    
    public static int getDistFromOrigin(int x, int y) {
        return Math.abs(x) + Math.abs(y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Point[] point = new Point[MAXN];
        
        int x, y;
        for(int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();

            point[i] = new Point(getDistFromOrigin(x, y), i + 1);
        }

        Arrays.sort(point, 0, n);

        for(int i = 0; i < n; i++)
            System.out.println(point[i].index);

    }
}
