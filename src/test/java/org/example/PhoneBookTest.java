package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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

    @Test
    public void testFindByNumber() {
        phoneBook.add("John", "1234567890");
        phoneBook.add("Alice", "9876543210");
        phoneBook.add("Bob", "5678901234");

        assertEquals("Alice", phoneBook.findByNumber("9876543210"));
        assertEquals("Bob", phoneBook.findByNumber("5678901234"));
        assertNull(phoneBook.findByNumber("5555555555")); // Non-existing number
    }
}