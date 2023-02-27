package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.MoviesManager;


public class MoviesManagerTest {
    MoviesManager manager = new MoviesManager();

    @Test
    public void testAddMoviesInLimits() {

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");
        manager.add("Movie 7");
        manager.add("Movie 8");
        manager.add("Movie 9");
        manager.add("Movie 10");
        manager.add("Movie 11");

        String[] expected = {"Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5", "Movie 6", "Movie 7", "Movie 8", "Movie 9", "Movie 10", "Movie 11"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAdd2Movies() {

        manager.add("Movie 1");
        manager.add("Movie 2");

        String[] expected = {"Movie 1", "Movie 2"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAdd1Movies() {

        manager.add("Movie 1");

        String[] expected = {"Movie 1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAdd0Movies() {

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddManyMovies() {

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");
        manager.add("Movie 7");
        manager.add("Movie 8");
        manager.add("Movie 9");
        manager.add("Movie 10");
        manager.add("Movie 11");
        manager.add("Movie 12");

        String[] expected = {"Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5", "Movie 6", "Movie 7", "Movie 8", "Movie 9", "Movie 10", "Movie 11", "Movie 12"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testShowLastMovies() {

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");

        String[] expected = {"Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testShowLastMoviesAboveLimit() {

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");
        manager.add("Movie 7");
        manager.add("Movie 8");
        manager.add("Movie 9");
        manager.add("Movie 10");
        manager.add("Movie 11");

        String[] expected = {"Movie 11", "Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testShowLastMoviesAtTheEndLimit() {

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");
        manager.add("Movie 7");
        manager.add("Movie 8");
        manager.add("Movie 9");
        manager.add("Movie 10");

        String[] expected = {"Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testShowLastMoviesUnderLimit() {

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");
        manager.add("Movie 7");
        manager.add("Movie 8");
        manager.add("Movie 9");


        String[] expected = {"Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}
