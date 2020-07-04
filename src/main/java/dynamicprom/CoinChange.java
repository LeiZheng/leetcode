package dynamicprom;

import java.util.*;

public class CoinChange {
    Map<Integer, Integer> mem = new HashMap<>();
    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;
        coinChangeRecursive(coins, amount, 0);
        return mem.getOrDefault(amount, -1);

    }
    //the time complexity is n*n
    private int coinChangeRecursive(int[] coins, int amount, int deep) {
        if(amount == 0) return deep;
        if(amount < 0) return -1;
        for(int i = coins.length - 1; i >= 0; i --) {
            int newDeep = coinChangeRecursive(coins, amount - coins[i], deep + 1);
            if(newDeep > 0) {
                int moreStep = newDeep - deep;
                if(mem.getOrDefault(amount, Integer.MAX_VALUE) > moreStep) {
                    mem.put(amount, moreStep);
                }
            }
        }
        return mem.containsKey(amount) ? mem.get(amount) + deep : -1;
    }

    public int coinChange2(int[] coins, int amount) {
        if(amount == 0) return 0;
        Set<Integer> mem = new HashSet<>();

        mem.add(0);

        int step = 0;
        while(!mem.isEmpty()) {
            step ++;
            Set<Integer> newMem = new HashSet<>();
            boolean isMatched = false;
            for(var key : mem) {
                for(var coin : coins) {
                    if(key + coin > amount){
                        continue;
                    }
                    newMem.add(key + coin);
                    if(key + coin == amount) {
                        isMatched = true;
                        break;
                    }
                }
            }
            if(isMatched){
                break;
            }
            mem = newMem;
            if(mem.isEmpty()) {
                step = -1;
                break;
            }
        }

        return step;
    }

    public int coinChange3(int[] coins, int amount) {
        int[] marks = new int[amount+1];
        Arrays.fill(marks, amount+1);
        marks[0] = 0;
        for(int i = 1; i <= amount; i ++) {
            for(int j = 0; j < coins.length; j ++) {
               int value =  i - coins[j];
               if(value >= 0) {
                   marks[i] = Math.min(marks[i], marks[value] + 1);
               }
            }
        }
        return marks[amount] == amount + 1 ? -1 : marks[amount];
    }


}
