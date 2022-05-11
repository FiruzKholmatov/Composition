package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerTest {

    private MovieManager manager = new MovieManager();

    private MovieItem first = new MovieItem(111, "Master and Margaret", 150, 8);
    private MovieItem second = new MovieItem(112, "Brigada", 180, 9);
    private MovieItem third = new MovieItem(113, "Maski Show", 195, 10);
    private MovieItem fourth = new MovieItem(114, "Railway Station for two", 220, 8);
    private MovieItem fifth = new MovieItem(115, "Dog Barbos and Unusual Cross", 200, 10);
    private MovieItem sixth = new MovieItem(116, "Avengers", 210, 9);
    private MovieItem seventh = new MovieItem(117, "The Adventure of Doctor Aybolit", 190, 8);
    private MovieItem eighth = new MovieItem(118, "Operation Y and other Shurik's adventures", 175, 9);
    private MovieItem ninth = new MovieItem(119, "Home Alone", 190, 10);
    private MovieItem tenth = new MovieItem(120, "Caucasian Hostage girl", 200, 10);
    private MovieItem eleventh = new MovieItem(121, "Don't look up", 185, 9);



    @Test
    public void MovieManagerWithAllItems() {

        MovieManager manager = new MovieManager();

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);


        MovieItem[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
        MovieItem[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void MovieManagerNonEmptyWithSetup5() {

        MovieManager manager = new MovieManager(5);

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);


        MovieItem[] expected = {eleventh, tenth, ninth, eighth, seventh};
        MovieItem[] actual = manager.findLast();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void MovieManagerNonEmptyWithoutSetup() {

        MovieManager manager = new MovieManager();

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);


        MovieItem[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        MovieItem[] actual = manager.findLast();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void MovieManagerEmptyWithSetupNull() {

        MovieManager manager = new MovieManager(0);

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);


        MovieItem[] expected = {};
        MovieItem[] actual = manager.findLast();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void MovieManagerNonEmptyWithSetup11() {

        MovieManager manager = new MovieManager(11);

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);


        MovieItem[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        MovieItem[] actual = manager.findLast();

        assertArrayEquals(expected, actual);


    }

    @Test
    public void MovieManagerNonEmptyWithSetup8() {

        MovieManager manager = new MovieManager(8);

        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);
        manager.save(eleventh);


        MovieItem[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth};
        MovieItem[] actual = manager.findLast();

        assertArrayEquals(expected, actual);


    }






}