package com.leetcode.removeSubFoldersInFileSystem;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.testng.Assert.assertTrue;

/**
 * RemoveSubFoldersFromFileSystem
 * <p>
 * This file was created on 25/10/24 / Friday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract List<String> removeSubfolders(String[] folder);

    @Test
    public void should_give_correct_output_1() {
        assertTrue(removeSubfolders(new String[]{"/a","/a/b","/c/d","/c/d/e","/c/f"}).containsAll(asList("/a","/c/d","/c/f")));
    }

    @Test
    public void should_give_correct_output_2() {
        assertTrue(removeSubfolders(new String[]{"/a","/a/b/c","/a/b/d"}).containsAll(asList("/a")));
    }

    @Test
    public void should_give_correct_output_3() {
        assertTrue(removeSubfolders(new String[]{"/a/b/c","/a/b/ca","/a/b/d"}).containsAll(asList("/a/b/c","/a/b/ca","/a/b/d")));
    }
}
