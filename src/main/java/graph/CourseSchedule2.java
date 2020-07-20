package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseSchedule2 {
    int deep = 0;
    boolean canFinish = true;
    int[] result;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[][] edges = new int[numCourses][numCourses];
        result = new int[numCourses];
        for(int i = 0; i < prerequisites.length; i ++) {
            edges[prerequisites[i][0]][prerequisites[i][1]] = 1;
        }
        int[] marks = new int[numCourses];
        Arrays.fill(marks, -1);
        for(int i = 0; i < numCourses; i ++) {
            findOrderRecur(i, marks, edges);
        }
        return canFinish? result : new int[]{};
    }

    private void findOrderRecur(int start, int[] marks, int[][] edges) {
        if(deep == marks.length) {
            return;
        }
        if(marks[start] == 2) {
            return;
        }
        if(marks[start] == 1) {
            canFinish = false;
        }
        if(!canFinish) {
            return;
        }
        marks[start] = 1;
        for(int i = 0; i < marks.length; i ++) {
            if(edges[start][i] == 1) {
                findOrderRecur(i, marks, edges);
            }
        }
        marks[start] = 2;

        result[deep++] = start;
    }


    public int[] findOrder3(int numCourses, int[][] prerequisites) {
        int[][] edges = new int[numCourses][numCourses];
        for(int i = 0; i < prerequisites.length; i ++) {
            edges[prerequisites[i][0]][prerequisites[i][1]] = 1;
        }
        List<Integer> result = new ArrayList();
        int[] marks = new int[numCourses];
        while(result.size() < numCourses) {
            boolean addMore = false;
            for(int i = 0; i < numCourses; i ++) {
                boolean hasEdge = false;
                if(marks[i] == 1) {
                    continue;
                }
                for(int j = 0; j < numCourses; j ++) {
                    if(edges[i][j] == 1) {
                        hasEdge = true;
                        break;
                    }
                }
                if(!hasEdge) {
                    for(int j = 0; j < numCourses; j ++) {
                        edges[j][i] = 0;
                    }

                    addMore = true;
                    marks[i] = 1;
                    result.add(i);
                }
            }
            if(!addMore) {
                return new int[]{};
            }
        }
        return result.stream().mapToInt(x -> x).toArray();
    }
}
