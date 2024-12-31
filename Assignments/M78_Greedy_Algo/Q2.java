package M78_Greedy_Algo;

import java.util.Arrays;

public class Q2 {
    public static int maxActivities(int[] start, int[] finish) {
        int[][] activities = new int[start.length][2];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = start[i];
            activities[i][1] = finish[i];
        }
        Arrays.sort(activities, (a, b) -> a[1] - b[1]);
        int count = 1, lastEnd = activities[0][1];
        for (int i = 1; i < activities.length; i++) {
            if (activities[i][0] >= lastEnd) {
                count++;
                lastEnd = activities[i][1];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9};
        System.out.println(maxActivities(start, finish));
    }
}
