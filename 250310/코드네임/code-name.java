import java.util.Scanner;

class Code_Inf {
    char codeName;
    int score;
    
    public Code_Inf() {
        this.codeName = 0;
        this.score = 0;
    }

    public Code_Inf(char codeName, int score) {
        this.codeName = codeName;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Code_Inf[] codeinfs = new Code_Inf[5];

        
        for (int i = 0; i < 5; i++) { 
            char codeName = sc.next().charAt(0);
            int score = sc.nextInt();
            codeinfs[i] = new Code_Inf(codeName, score);
        }

        Code_Inf minAgent = codeinfs[0]; 

        for (int i = 1; i < 5; i++) {
            if (codeinfs[i].score < minAgent.score) {
                minAgent = codeinfs[i];
            }
        }

        System.out.println(minAgent.codeName + " " + minAgent.score);
        
        sc.close();
    }
}
