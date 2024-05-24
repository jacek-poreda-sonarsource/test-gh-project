package com.sonarsource;

public class SomeClass {
  private final SomethingDeprecated somethingDeprecated = new SomethingDeprecated();

  public static void main(String[] args) {
    new SomethingDeprecated().doSomething();
  }

  public static void other(String[] args) {
    new SomethingDeprecated().doSomething();
  }
}
