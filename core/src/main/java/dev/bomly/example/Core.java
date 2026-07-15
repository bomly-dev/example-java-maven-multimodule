package dev.bomly.example;

import org.apache.commons.lang3.StringUtils;

public final class Core {
    private Core() {}

    public static boolean isBlank(String value) {
        return StringUtils.isBlank(value);
    }
}
