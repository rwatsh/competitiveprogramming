package dmoj;
// https://dmoj.ca/problem/lkp18c2p1

import java.util.Scanner;

public class FoodLines {
    private static int shortestLineIndex(int[] lines) {
        if (lines.length == 0) return -1;

        int min = lines[0];
        int minIndex = 0;
        for(int i = 1; i  < lines.length; i++) {
            if (lines[i] < min) {
                min = lines[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] lines = new int[n];
        for (int i = 0; i < n; i++) {
            lines[i] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int index = shortestLineIndex(lines);
            System.out.println(lines[index]);
            lines[index]++;
        }
    }
}
