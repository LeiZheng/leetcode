package arrayAndString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        List<Integer> ver1List = Arrays.asList(version1.split("\\.")).stream().map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> ver2List = Arrays.asList(version2.split("\\.")).stream().map(Integer::parseInt).collect(Collectors.toList());
        int i = 0;
        for(; i < Math.min(ver1List.size(), ver2List.size()); i ++){
            if(ver1List.get(i) != ver2List.get(i)) {
                return (ver1List.get(i) - ver2List.get(i)) > 0 ? 1 : -1;
            }
        }
        int ret = 0;
        if(ver1List.size() > i){
            int sum =  ver1List.subList(i, ver1List.size()).stream().mapToInt(x -> x).sum();
            if(sum > 0) {
                ret = 1;
            }
        }
        if(ver2List.size() > i){
            int sum =  ver2List.subList(i, ver2List.size()).stream().mapToInt(x -> x).sum();
            if(sum > 0) {
                ret = -1;
            }
        }
        return ret;
    }
}
