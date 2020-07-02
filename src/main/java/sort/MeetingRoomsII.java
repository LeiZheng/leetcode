package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRoomsII {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(v -> v[0]));
        int meetingRooms = 0;
        PriorityQueue<Integer> endings = new PriorityQueue<>();
        for(int i = 0; i < intervals.length; i ++) {
            while(!endings.isEmpty() && endings.peek() <= intervals[i][0]) {
                 endings.poll();
            }
            endings.add(intervals[i][1]);
            meetingRooms = Math.max(endings.size(), meetingRooms);
        }
        return  meetingRooms;
    }
}
