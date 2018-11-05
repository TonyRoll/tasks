package com.epam.task.task3;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<Item> itemStorage = new ArrayList<>();

        Item firstBook = new Book(1L, false, "Author 1", "Title 1", "Publisher 1", 2001);
        Item secondBook = new Book(2L, false, "Author 2", "Title 2", "Publisher 2", 2002);
        Item thirdBook = new Book(3L, true, "Author 3", "Title 3", "Publisher 3", 2003);
        Item firstMagazine = new Magazine(4L, false, 1, 1, 2004, "Title 4");
        Item secondMagazine = new Magazine(5L, true, 2, 2, 2005, "Title 5");
        itemStorage.add(firstBook);
        itemStorage.add(secondBook);
        itemStorage.add(thirdBook);
        itemStorage.add(firstMagazine);
        itemStorage.add(secondMagazine);

        showItemStorage(itemStorage);

        thirdBook.returN();

        showItemStorage(itemStorage);
    }

    private static void showItemStorage(List<Item> itemStorage) {
        for (Item item : itemStorage) {
            item.show();
        }
    }
}
