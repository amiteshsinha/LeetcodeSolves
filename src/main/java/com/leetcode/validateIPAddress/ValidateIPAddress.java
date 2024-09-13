package com.leetcode.validateIPAddress;

public class ValidateIPAddress extends AbstractParent {

    private static final String NEITHER = "Neither";

    @Override
    public String validIPAddress(String queryIP) {
        if (queryIP.contains(".")) {
            if (queryIP.charAt(0) == '.' || queryIP.charAt(queryIP.length() - 1) == '.') {
                return NEITHER;
            }
            return validateIPV4Add(queryIP.split("\\."));
        } else if (queryIP.contains(":")) {
            if (queryIP.charAt(0) == ':' || queryIP.charAt(queryIP.length() - 1) == ':') {
                return NEITHER;
            }
            return validIPV6Address(queryIP.split(":"));
        }
        return NEITHER;
    }

    private String validIPV6Address(String[] split) {
        if (split.length != 8) {
            return NEITHER;
        }
        for (String s : split) {
            if (s.length() > 4 || s.length() < 1) {
                return NEITHER;
            }
            if (!s.matches("^[0-9a-fA-F]{1,4}$")) {
                return NEITHER;
            }
        }
        return "IPv6";
    }

    private String validateIPV4Add(String[] split) {
        if (split.length != 4) {
            return NEITHER;
        }
        for (String s : split) {
            if (s.length() > 3 || s.length() < 1) {
                return NEITHER;
            }
            if (s.charAt(0) == '0' && s.length() > 1) {
                return NEITHER;
            }
            try {
                int k = Integer.parseInt(s);
                if (k > 255 || k < 0) {
                    return NEITHER;
                }
            } catch (NumberFormatException e) {
                return NEITHER;
            }
        }
        return "IPv4";
    }
}
