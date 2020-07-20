package design;

import linkedList.MergeKSortedLists;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class MedianFinder {
    /** initialize your data structure here. */
    private LinkedList<Integer> values = new LinkedList<>();
    public MedianFinder() {

    }

    public void addNum(int num) {
        int left = 0;
        int right = values.size() - 1;
        while(left < right) {
            int mid = (left + right) / 2;
            if(num == values.get(mid)) {
                values.add(mid, num);
                break;
            }
            else if(num > values.get(mid)){
                left = mid;
            }
            else {
                right = mid;
            }
        }
        values.add(left, num);

    }

    public double findMedian() {
        if(values.size() % 2 == 1) {
            return values.get(values.size() - 1) / 2;
        }
        else {
            return (values.get(values.size() / 2 - 1) + values.get(values.size() / 2)) / 2.0;
        }
    }
}
