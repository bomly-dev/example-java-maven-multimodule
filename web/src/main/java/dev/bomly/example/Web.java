package dev.bomly.example;

public final class Web {
    private Web() {}

    public static String greet(String name) {
        return Core.isBlank(name) ? "hello" : "hello " + name;
    }
}
