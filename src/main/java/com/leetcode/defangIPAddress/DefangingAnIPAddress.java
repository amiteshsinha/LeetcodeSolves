package com.leetcode.defangIPAddress;

public class DefangingAnIPAddress extends AbstractParent {

    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 34.29%
     *
     * Memory
     * 41.04
     * MB
     * Beats
     * 96.33%
     * @param address
     * @return
     */
    public String defangIPaddr1(String address) {
        return address.replaceAll("\\.", "[.]");
    }

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 41.15
     * MB
     * Beats
     * 89.94%
     * @param address
     * @return
     */
    public String defangIPaddr(String address) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                s.append("[.]");
            } else {
                s.append(address.charAt(i));
            }
        }
        return s.toString();
    }
}
