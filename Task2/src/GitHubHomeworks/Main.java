package GitHubHomeworks;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] table = new int[5];
        Random rand = new Random();
        for (int i = 0; i < table.length; i++) {
            table[i] = rand.nextInt(100); // Random values from 0-99
        }
        for (int i : table) {
            System.out.println(i);
        }
    }
}
