package com.crispim.graphql.records;

import java.util.Arrays;
import java.util.List;

public record Author(String id, String name, String lastName) {

    private static List<Author> authors = Arrays.asList(
            new Author("1", "Machado", "de Assis"),
            new Author("2", "Clarice", "Lispector"),
            new Author("3", "James", "Joyce")
    );

    public static Author getById(String id) {
        return authors.stream()
                .filter(author -> author.id().equals(id))
                .findFirst()
                .orElse(null);
    }
}
