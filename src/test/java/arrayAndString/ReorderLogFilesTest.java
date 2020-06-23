package arrayAndString;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ReorderLogFilesTest {
    ReorderLogFiles inst = new ReorderLogFiles();

    @Test
    public void reorderLogFiles() {
        String[] orderedLogs = inst.reorderLogFiles(new String[]{"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"});

        assertThat(orderedLogs, is(new String[]{"let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"}));
    }
}