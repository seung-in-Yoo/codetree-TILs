import java.util.Scanner;

class BoomClear {
    String uCode;
    char lColor;
    int time;

    public BoomClear() {
        this.uCode = "";
        this.lColor = ' ';
        this.time = 0;
    }

    public BoomClear(String uCode, char lColor, int time) {
        this.uCode = uCode;
        this.lColor = lColor;
        this.time = time;
    }

    public void printInfo() {
        System.out.println("code : " + uCode);
        System.out.println("color : " + lColor);
        System.out.println("second : " + time);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        
        BoomClear boom = new BoomClear(uCode, lColor, time);

        boom.printInfo();

        sc.close();
    }
}