package amazon.arrayAndString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReorderLogFiles {
    public String[] reorderLogFiles(String[] logs) {
        Comparator<? super String> compareLogKey = (v1, v2) -> {
            String[] v1Keys = v1.split(" ", 2);
            String[] v2Keys = v2.split(" ", 2);
            boolean isV1Dig = Character.isDigit(v1Keys[1].charAt(0));
            boolean isV2Dig = Character.isDigit(v2Keys[1].charAt(0));
            if (!isV1Dig && isV2Dig) {
                return -1;
            } else if (isV1Dig && !isV2Dig) {
                return 1;
            } else if (!isV1Dig && !isV2Dig) {
                int compareRet = v1Keys[1].compareTo(v2Keys[1]);
                return compareRet == 0? v1Keys[0].compareTo(v2Keys[0]) : compareRet;
            } else {
                return 0;
            }
        };
        Arrays.sort(logs, compareLogKey);
        return logs;
    }
}
