package com.leetcode.brickwall;

import org.junit.jupiter.api.Test;

import java.util.*;

public class BrickWall {

    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> gaps = new HashMap<>();
        int mostGaps = 0;
        for(List<Integer> bricks : wall)
        {
            int n = 0;
            for(int i=0;i<bricks.size()-1;i++)
            {
                n += bricks.get(i);
                gaps.put(n, gaps.getOrDefault(n, 0) + 1);
                mostGaps = Math.max(mostGaps, gaps.get(n));
            }
        }

        return wall.size() - mostGaps;
    }

    @Test
    public void shouldReturnLeastBricks() {
        List<List<Integer>> wall = new ArrayList<>();
        wall.add(Arrays.asList(1, 2, 2, 1));
        wall.add(Arrays.asList(3, 1, 2));
        wall.add(Arrays.asList(1, 3, 2));
        wall.add(Arrays.asList(2, 4));
        wall.add(Arrays.asList(3, 1, 2));
        wall.add(Arrays.asList(1, 3, 1, 1));
        assert (leastBricks(wall) == 2);
    }

    @Test
    public void shouldReturnLeastBricks2() {
        List<List<Integer>> wall = new ArrayList<>();
        wall.add(Arrays.asList(2));
        wall.add(Arrays.asList(2));
        wall.add(Arrays.asList(2));
        assert (leastBricks(wall) == 3);
    }

    @Test
    public void shouldReturnLeastBricks3() {
        List<List<Integer>> wall = new ArrayList<>();
        wall.add(Arrays.asList(6));
        wall.add(Arrays.asList(6));
        wall.add(Arrays.asList(2, 4));
        wall.add(Arrays.asList(6));
        wall.add(Arrays.asList(1, 2, 2, 1));
        wall.add(Arrays.asList(6));
        wall.add(Arrays.asList(2, 1, 2, 1));
        wall.add(Arrays.asList(1, 5));
        wall.add(Arrays.asList(4, 1, 1));
        wall.add(Arrays.asList(1, 4, 1));
        wall.add(Arrays.asList(4, 2));
        wall.add(Arrays.asList(3, 3));
        wall.add(Arrays.asList(2, 2, 2));
        wall.add(Arrays.asList(5, 1));
        wall.add(Arrays.asList(5, 1));
        wall.add(Arrays.asList(6));
        wall.add(Arrays.asList(4, 2));
        wall.add(Arrays.asList(1, 5));
        wall.add(Arrays.asList(2, 3, 1));
        wall.add(Arrays.asList(4, 2));
        wall.add(Arrays.asList(1, 1, 4));
        wall.add(Arrays.asList(1, 3, 1, 1));
        wall.add(Arrays.asList(2, 3, 1));
        wall.add(Arrays.asList(3, 3));
        wall.add(Arrays.asList(3, 1, 1, 1));
        wall.add(Arrays.asList(3, 2, 1));
        wall.add(Arrays.asList(6));
        wall.add(Arrays.asList(3, 2, 1));
        wall.add(Arrays.asList(1, 5));
        wall.add(Arrays.asList(1, 4, 1));
        assert (leastBricks(wall) == 17);
    }

    @Test
    public void shouldReturnLeastBricks4() {
        List<List<Integer>> wall = new ArrayList<>();
        wall.add(Arrays.asList(1, 2));
        wall.add(Arrays.asList(2, 1));
        wall.add(Arrays.asList(3));
        assert (leastBricks(wall) == 2);
    }

    @Test
    public void shouldReturnLeastBricks5() {
        List<List<Integer>> wall = new ArrayList<>();
        wall.add(Arrays.asList(100000000));
        wall.add(Arrays.asList(100000000));
        wall.add(Arrays.asList(100000000));
        assert (leastBricks(wall) == 3);
    }

    @Test
    public void shouldReturnLeastBricks6() {
        List<List<Integer>> wall = new ArrayList<>();
        wall.add(Arrays.asList(1, 2147483646));
        wall.add(Arrays.asList(2, 2147483645));
        wall.add(Arrays.asList(9999, 2147473648));
        wall.add(Arrays.asList(10000, 2147473647));
        assert (leastBricks(wall) == 3);
    }
}
