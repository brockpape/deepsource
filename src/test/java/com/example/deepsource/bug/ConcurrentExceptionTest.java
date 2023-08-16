package com.example.deepsource.bug;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcurrentExceptionTest {

  private ConcurrentException testee = new ConcurrentException();

  @Test
  void testThatFails() {
    testee.listFail();
  }
}
