package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PhoneBookTest {

    private PhoneBook phoneBook;
    @BeforeEach
    public void setup() {
        phoneBook = new PhoneBook();
    }

    @Test
    public void testAddContact() {
        int initialCount = phoneBook.add("John", "1234567890");
        assertEquals(1, initialCount);

        int updatedCount = phoneBook.add("Alice", "9876543210");
        assertEquals(2, updatedCount);
    }
}