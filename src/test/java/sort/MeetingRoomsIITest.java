package sort;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MeetingRoomsIITest {
    MeetingRoomsII inst = new MeetingRoomsII();
    @Test
    public void minMeetingRooms() {
        int ret = inst.minMeetingRooms(new int[][]{{0, 30}, {5, 10}, {15, 20}});
        assertThat(ret, is(2));
    }
}