package graph;

import graph.WordLadder;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class WordLadderTest {
    WordLadder inst = new WordLadder();
    @Test
    public void ladderLength() {
        int lenght = inst.ladderLength("hit", "cog", Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));
        assertThat(lenght, is(5));
    }
    @Test
    public void ladderLength2() {
        int lenght = inst.ladderLength("qa", "sq", Arrays.asList("si","go","se","cm","so","ph","mt","db","mb","sb","kr","ln","tm","le","av","sm","ar","ci","ca","br","ti","ba","to","ra","fa","yo","ow","sn","ya","cr","po","fe","ho","ma","re","or","rn","au","ur","rh","sr","tc","lt","lo","as","fr","nb","yb","if","pb","ge","th","pm","rb","sh","co","ga","li","ha","hz","no","bi","di","hi","qa","pi","os","uh","wm","an","me","mo","na","la","st","er","sc","ne","mn","mi","am","ex","pt","io","be","fm","ta","tb","ni","mr","pa","he","lr","sq","ye"));
        assertThat(lenght, is(5));
    }

    @Test
    public void ladderLength3() {
        int ret = inst.ladderLength(
                "red",
                "tax",
                        Arrays.asList("ted","tex","red","tax","tad","den","rex","pee"));
        assertThat(ret, is(4));
    }
}