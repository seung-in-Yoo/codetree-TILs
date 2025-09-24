import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // A 직사각형 
        int ax1 = sc.nextInt();
        int ay1 = sc.nextInt();
        int ax2 = sc.nextInt();
        int ay2 = sc.nextInt();

        // B 직사각형 
        int bx1 = sc.nextInt();
        int by1 = sc.nextInt();
        int bx2 = sc.nextInt();
        int by2 = sc.nextInt();

        // M 직사각형 (겹쳐있음)
        int mx1 = sc.nextInt();
        int my1 = sc.nextInt();
        int mx2 = sc.nextInt();
        int my2 = sc.nextInt();
       
        int areaA = (ax2 - ax1) * (ay2 - ay1); // A 직사각형 넓이 
        int areaB = (bx2 - bx1) * (by2 - by1); // B 직사각형 넓이 

        int overA = overArea(ax1, ay1, ax2, ay2, mx1, my1, mx2, my2);
        int overB = overArea(bx1, by1, bx2, by2, mx1, my1, mx2, my2);

        int finalArea = (areaA - overA) + (areaB - overB);

        System.out.println(finalArea);
    }

    // 겹치는 부분 구하는 함수 구현 
    static int overArea(int x1, int y1, int x2, int y2,
                               int x3, int y3, int x4, int y4) {
        int overX1 = Math.max(x1, x3);
        int overY1 = Math.max(y1, y3);
        int overX2 = Math.min(x2, x4);
        int overY2 = Math.min(y2, y4);

        int width = overX2 - overX1;
        int height = overY2 - overY1;

        if (width > 0 && height > 0) {
            return width * height;
        } else {
            return 0;
        }
    }
}