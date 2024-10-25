package com.leetcode.removeSubFoldersInFileSystem;

import java.util.*;

/**
 * Runtime
 * 33
 * ms
 * Beats
 * 97.75%
 *
 * Memory
 * 53.53
 * MB
 * Beats
 * 95.71%
 * This file was created on 25/10/24 / Friday
 *
 * @author Amitesh Sinha
 */
public class RemoveSubFoldersFromFileSystemIter1 extends AbstractParent {

    @Override
    public List<String> removeSubfolders(String[] folder) {
        List<String> retList = new ArrayList<>();
        Arrays.sort(folder);
        String last = folder[0] + "/";
        retList.add(folder[0]);
        for (int i = 1; i < folder.length; i++) {
            if (!folder[i].startsWith(last)) {
                last = folder[i] + "/";
                retList.add(folder[i]);
            }
        }
        return retList;
    }

}
