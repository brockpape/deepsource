package com.example.deepsource.optional;

import java.util.List;
import java.util.Optional;

public class OptionalFail2 {

    public Optional<List<String>> fetchItems() {
        List<String> items = getItems();
        return Optional.of(items);
    }

    private List<String> getItems() {
        return List.of("1", "2");
    }

}
