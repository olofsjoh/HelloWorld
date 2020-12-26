package org.jool.ecommerce;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreFrontTest {

    StoreFront storeFront = new StoreFront();

    @BeforeEach
    void setUp() {
        storeFront.addItem("ID_1", "Dell XPS 15", "12000", "100");
    }

    @Test
    void getItem() {
        assertEquals(1, storeFront.getSize());
    }
}