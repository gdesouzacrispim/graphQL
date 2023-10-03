package com.crispim.graphql.records;

import java.util.Arrays;
import java.util.List;

public record Publisher(String id, String name, String since, String addressId) {

    private static List<Publisher> publishers = Arrays.asList(
             new Publisher("1", "Editora Nacional", "1980", "1"),
            new Publisher("2", "Companhia das Letras", "1990", "2"),
            new Publisher("3", "Civilização Brasileira", "1970", "3"));

    public static Publisher getById(String id) {
        return publishers.stream()
                .filter(publisher -> publisher.id().equals(id))
                .findFirst()
                .orElse(null);
    }
}
