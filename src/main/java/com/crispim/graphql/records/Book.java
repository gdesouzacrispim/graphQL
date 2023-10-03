package com.crispim.graphql.records;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public record Book(String id, String name, Integer pageCount, String authorId, String publisherId) {

    private static final UUID uuid1 = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
    private static final UUID uuid2 = UUID.fromString("6ba7b810-9dad-11d1-80b4-00c04fd430c8");
    private static final UUID uuid3 = UUID.fromString("550e8400-e29b-41d4-a716-446655440000");

    private static List<Book> books = Arrays.asList(
            new Book("1", "Dom Casmurro", 300, "1", "1"),
            new Book("2", "A Hora da Estrela", 200, "2", "2"),
            new Book("3", "Ulisses", 820, "3", "3"));

    public static Book getById(String id) {
        return books.stream()
                .filter(book -> book.id().equals(id))
                .findFirst()
                .orElse(null);
    }

    public static List<Book> getAllBooks() {
        return books;
    }

}
