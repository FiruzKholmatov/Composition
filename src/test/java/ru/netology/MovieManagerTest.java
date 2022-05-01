package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MovieManagerTest {

    MovieManager manager = new MovieManager(5);

    MovieItem first = new MovieItem(11, "Master and Margaret", 150, 8);
    MovieItem second = new MovieItem(26, "Brigada", 180, 9);
    MovieItem third = new MovieItem(23, "Maski Show", 195, 10);

    @Test
    public void MovieManagerNonEmptyWithSetup() {


        manager.save(first);
        manager.save(second);
        manager.save(third);


        MovieItem[] expected = {third, second, first};
        MovieItem[] actual = manager.findLast();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void MovieManagerNonEmptyWithSetup2() {


        manager.save(first);
        manager.save(second);
        manager.save(third);

        MovieItem[] expected = {first, second, third};
        MovieItem[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }


}