package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void testNormalItem() {
        Item[] items = new Item[] { new Item("+5 Dexterity Vest", 10, 20) };
        GildedRose app = new GildedRose(items);
        assertEquals(items[0].quality, 20);
        assertEquals(items[0].sellIn, 10);
        app.nextDay();
        assertEquals(items[0].quality, 19);
        assertEquals(items[0].sellIn, 9);
        app.nextDay();
        assertEquals(items[0].quality, 18);
        assertEquals(items[0].sellIn, 8);
    }

    @Test
    void testAgingItem() {
        Item[] items = new Item[] { new Item("Aged Brie", 10, 48) };
        GildedRose app = new GildedRose(items);
        app.nextDay();
        assertEquals(items[0].quality, 49);
        assertEquals(items[0].sellIn, 9);
        app.nextDay();
        assertEquals(items[0].quality, 50);
        assertEquals(items[0].sellIn, 8);
        app.nextDay();
        assertEquals(items[0].quality, 50);
        assertEquals(items[0].sellIn, 7);
    }

}
