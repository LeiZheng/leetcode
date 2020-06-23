package graph;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class CutOffTrees {
    HashMap<MIndex<String>, Integer> allPosDists = new HashMap<>();
    TreeMap<Integer, MIndex<Integer>> sortedTrees = new TreeMap<>();
    public int cutOffTree(List<List<Integer>> forest) {
        int[][] flags = new int[forest.size()][forest.get(0).size()];
        for(int i = 0; i < forest.size();i ++) {
            for(int j = 0; j < forest.get(0).size(); j ++) {
                allPosDists.put(new MIndex<>("" + i + "," + j, "" + i + "," + j), 0);
            }
        }

        cutOffTreeRecursive(forest, 0, 0, flags, 0, "");

        for(int i = 0; i < forest.size();i ++) {
            for(int j = 0; j < forest.get(0).size(); j ++) {
                if(forest.get(i).get(j) > 0 && flags[i][j] == 0) {
                    return -1;
                }
            }
        }
        int totalSteps = 0;
        int preI = 0, preJ = 0;
        for(var treeItem : sortedTrees.values()) {
            String fromStep = "" + preI + "," + preJ;
            String newStep =  "" + treeItem.getV1() + "," + treeItem.getV2();
            totalSteps += allPosDists.get(new MIndex<>(fromStep, newStep));
            preI = treeItem.getV1();
            preJ = treeItem.getV2();
        }
        return totalSteps;
    }

    private void cutOffTreeRecursive(List<List<Integer>> forest, int i, int j, int[][] flags, int deep, String preKey) {
        if(i >= forest.size() || i < 0) return;
        if(j >= forest.get(0).size() || j < 0 ) return;
        if(forest.get(i).get(j) == 0) return;
        String key = "" + i + "," + j;
        if(flags[i][j] > 0 ) {
            updateAllPosDists(preKey, key);
            return;
        }
        flags[i][j] = 1;
        sortedTrees.put(forest.get(i).get(j), new MIndex<>(i, j));
        updateAllPosDists(preKey, key);

        cutOffTreeRecursive(forest, i + 1, j, flags, deep +1, key);
        cutOffTreeRecursive(forest, i - 1, j, flags, deep + 1, key);
        cutOffTreeRecursive(forest, i  , j + 1, flags, deep + 1, key);
        cutOffTreeRecursive(forest, i, j - 1, flags, deep + 1, key);

    }

    private void updateAllPosDists(String preKey, String currKey) {
        if("".equalsIgnoreCase(preKey)) return;
        allPosDists.put(new MIndex<>(preKey, currKey), 1);
        for(var mindex : allPosDists.keySet().toArray(new MIndex[0])) {
            if(mindex.has(currKey)) {
                int dist = allPosDists.get(mindex);
                MIndex<String> key = mindex.replaceKey(currKey, preKey);
                if(allPosDists.getOrDefault(key, Integer.MAX_VALUE) + 1 < dist) {
                    allPosDists.put(key, allPosDists.getOrDefault(key, Integer.MAX_VALUE) + 1);
                }
            }
        }
    }
}
