package GitHubHomeworks;

import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] table = new Integer[5];
        Random rand = new Random();
        for (int i = 0; i < table.length; i++) {
            table[i] = rand.nextInt(100);
        }
        Arrays.sort(table);
        for (int i : table) {
            System.out.println(i);
        }
    }
}
