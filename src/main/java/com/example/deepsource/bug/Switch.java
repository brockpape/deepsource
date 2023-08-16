package com.example.deepsource.bug;

public class Switch {

  public static void switchCasePrimer(int caseIndex) {
    switch (caseIndex) {
      case 0:
        System.out.println("Zero");
      case 1:
        System.out.println("One");
        break;
      case 2:
        System.out.println("Two");
        break;
      default:
        System.out.println("Default");
    }
  }
}
