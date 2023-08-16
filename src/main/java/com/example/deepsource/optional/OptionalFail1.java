package com.example.deepsource.optional;

import java.util.Optional;

public class OptionalFail1 {

  public static final String USER_STATUS = "UNKNOWN";

  public String findUserStatus(long id) {

    Optional<String> status = findById(id);

    if (status.isPresent()) {
      return status.get();
    } else {
      return USER_STATUS;
    }
  }

  private Optional<String> findById(long id) {
    return Optional.empty();
  }
}
