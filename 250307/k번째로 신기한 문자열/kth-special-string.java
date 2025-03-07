import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int k = sc.nextInt(); 
        String t = sc.next(); 
        sc.nextLine(); 

        ArrayList<String> matchedWords = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            if (word.startsWith(t)) { 
                matchedWords.add(word);
            }
        }

        Collections.sort(matchedWords);

        
        if (k <= matchedWords.size()) {
            System.out.println(matchedWords.get(k - 1));
        } else {
            System.out.println("단어를 찾을수 없음");
        }
    }
}
