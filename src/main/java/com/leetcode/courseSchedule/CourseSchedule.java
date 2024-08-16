package com.leetcode.courseSchedule;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CourseSchedule extends AbstractParent {

    // create a map of child course (b) and its dependent parents
    // create an array of visited courses by max course.
    // from the course list start with the one not present then one with max dependents
    @Override
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> courseAndDependentCourseMap = new HashMap<>();
        int[] visited = new int[numCourses], temp;
        int max = 0, key = -1, length;
        for (int i = 0; i < prerequisites.length; i++) {
            temp = prerequisites[i];
            if (temp.length == 2) {
                if (temp[0] == temp[1]) {
                    return false;
                }
                courseAndDependentCourseMap.computeIfAbsent(temp[1], k -> new LinkedList<>()).add(temp[0]);
                visited[temp[0]]++;
//                length = courseAndDependentCourseMap.get(temp[1]).size();
//                if (length > max) {
//                    max = length;
//                    key = temp[1];
//                }
            }
        }

        Queue<Integer> parseQueue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0) {
                parseQueue.add(i);
            }
        }
//        if (key > -1) {
//            parseQueue.add(key);
//        }
        visited = new int[numCourses];
        while (!parseQueue.isEmpty()) {
            key = parseQueue.poll();
            if (visited[key] > 0 && courseAndDependentCourseMap.containsKey(key)) {
                return false;
            }
            visited[key] = 1;
            if (courseAndDependentCourseMap.containsKey(key)) {
                parseQueue.addAll(courseAndDependentCourseMap.get(key));
            }
        }
        return true;
    }
}
