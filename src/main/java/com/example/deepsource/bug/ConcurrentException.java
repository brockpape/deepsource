package com.example.deepsource.bug;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentException {

    public void listFail() {
        List<String> hats = new ArrayList<>();
        hats.add("1"); // that one has ear flaps
        hats.add("2");
        hats.add("3");
        for (String hat : hats) {
            if (hat.equals("1")) {
                hats.remove(hat);
            }
        }
    }

}
