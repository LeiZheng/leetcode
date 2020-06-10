package amazon.arrayAndString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class IntegerToEnglish {
    public String numberToWords(int num) {
        if(num == 0) return "Zero";
        String[] singleName = new String[] {"", "One", "Two", "Three","Four","Five","Six","Seven","Eight","Nine"};
        String[] tyNames = new String[] {"", "Ten", "Twenty", "Thirty", "Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        String[] tenNames = new String[]{"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        //the mapping between count of zero and name
        Map<Integer, String> moreName = Map.of(0, "", 3, "Thousand", 6, "Million", 9, "Billion");
        int residual = num;
        List<String> results = new ArrayList<>();
        for(int i = 0; residual > 0; i ++) {
            int modHundredValue = residual % 1000 / 100;
            int modTenValue = residual % 100 / 10;
            int modSingleValue = residual %10;
            residual = residual / 1000;
            if(modHundredValue == 0 && modTenValue == 0 && modSingleValue == 0) {
                continue;
            }
            if(i > 0) {
                results.add(moreName.get(i * 3));
            }
            if(modTenValue == 1) {
                results.add(tenNames[modSingleValue]);
            }
            else {
                if(modSingleValue > 0) {
                    results.add(singleName[modSingleValue]);
                }
                if(modTenValue > 0) {
                    results.add(tyNames[modTenValue]);
                }
            }
            if(modHundredValue > 0) {
                results.add("Hundred");
                results.add(singleName[modHundredValue]);
            }
        }
        Collections.reverse(results);
        return String.join(" ", results);
    }
}
