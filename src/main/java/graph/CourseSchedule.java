package graph;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites.length == 0) return true;
        int[][] flags = new int[numCourses][numCourses];
        int[][] accessGraph = new int[numCourses][numCourses];
        for(int i = 0; i < prerequisites.length; i ++) {
            accessGraph[prerequisites[i][0]][prerequisites[i][1]] = 1;
        }
        for(int i = 0; i < numCourses; i ++) {
            accessGraph[i][i] = 1;
        }
        for(int i = 0; i < prerequisites.length; i ++) {
            if(!canFinishRecursive(accessGraph, prerequisites[i][0], prerequisites[i][0], flags)){
                return false;
            }
        }

        return true;
    }

    private boolean canFinishRecursive(int[][] accessGraph, int i, int j, int[][] flags) {
        if(flags[i][j] == 1) return false;
        flags[i][j] = 1;
        for(int index = 0; index < accessGraph.length; index ++) {
            if(j != index && accessGraph[j][index] == 1 && !canFinishRecursive(accessGraph, j, index, flags)) {
                return false;
            }
        }
        flags[i][j] = 0;
        return true;
    }
}
