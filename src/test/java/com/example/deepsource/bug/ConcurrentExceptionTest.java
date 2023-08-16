package com.example.deepsource.bug;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcurrentExceptionTest {

    private ConcurrentException testee = new ConcurrentException();

    @Test
    void testThatFails() {
        testee.listFail();
    }

}