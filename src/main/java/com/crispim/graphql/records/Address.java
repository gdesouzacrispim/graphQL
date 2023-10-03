package com.crispim.graphql.records;

import java.util.Arrays;
import java.util.List;

public record Address(String id, Integer number, String street, String city, String country, Integer postalCode) {
    private static List<Address> addresses = Arrays.asList(
            new Address("1", 123, "Rua A", "São Paulo", "Brasil", 12345),
            new Address("2", 456, "Rua B", "Rio de Janeiro", "Brasil", 67890),
            new Address("3", 589, "Rua C", "Rio de Janeiro", "Brasil", 258987));

    public static Address getById(String id) {
        return addresses.stream()
                .filter(address -> address.id().equals(id))
                .findFirst()
                .orElse(null);
    }
}
