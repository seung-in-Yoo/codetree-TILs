import java.util.Scanner;

class NextLevel {
    String id;
    int level;

    
    public NextLevel() {
        this.id = "codetree";
        this.level = 10;
    }

    
    public NextLevel(String id, int level) {
        this.id = id;
        this.level = level;
    }

    
    public void printUser() {
        System.out.println("user " + id + " lv " + level);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        String id = sc.next();
        int level = sc.nextInt();

        
        NextLevel user1 = new NextLevel();          
        NextLevel user2 = new NextLevel(id, level); 

        
        user1.printUser();
        user2.printUser();

    }
}
