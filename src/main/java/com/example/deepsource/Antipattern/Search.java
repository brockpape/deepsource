package com.example.deepsource.Antipattern;

import java.util.Arrays;

public class Search {

  public int search() {
    String[] candidates = getCandidates();
    String searchingFor = "The Lost Boys";
    int found = -1;
    for (int i = 0; i < candidates.length; i++) { // flat tire
      if (candidates[i].equals(searchingFor)) {
        found = i;
      }
    }
    return found;
  }

  public int betterApproch() {
    int found = -1;
    String searchingFor = "The Lost Boys";
    String[] candidates = getCandidates();
    Arrays.sort(candidates); // start of "better" approach
    found = Arrays.binarySearch(candidates, searchingFor);
    return found;
  }

  private String[] getCandidates() {
    String[] strings = {"1", "2", "The Lost Boys"};
    return strings;
  }
}
