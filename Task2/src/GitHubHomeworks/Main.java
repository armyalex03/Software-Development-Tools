package GitHubHomeworks;

import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] table = new int[5];
        Random rand = new Random();
        for (int i = 0; i < table.length; i++) {
            table[i] = rand.nextInt(100);
        }
        Arrays.sort(table); // Sort table
        for (int i : table) {
            System.out.println(i);
        }
        
        System.out.println("Hello world");
    }
}
