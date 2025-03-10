import java.util.Scanner;

class Goods {
    String id2;
    int code2;

    public Goods() {
        this.id2 = "codetree";
        this.code2 = 50;
    }

    public Goods(String id2, int code2) {
        this.id2 = id2;
        this.code2 = code2;
    }

    public void printInfo() {
        System.out.println("product " + code2 + " is " + id2);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();

    Goods goods1 = new Goods();
    goods1.printInfo();
        
        
    Goods goods2 = new Goods(id2, code2);
    goods2.printInfo();
        
    sc.close();
    }
}