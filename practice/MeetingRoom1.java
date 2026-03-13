import java.util.*;
package practice;

public class MeetingRoom1 {
     
          public static boolean isMeeting(int[][] intervals) {
                    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
                    for (int i = 1; i < intervals.length; i++) {
                              if (intervals[i][0] < intervals[i - 1][1]) {
                                        return false;
                              }
                    }
                    return true;

          }
          public static void main(String[] args) {
                    
          }
}
