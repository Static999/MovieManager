package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    @Test
    public void testLessLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie("film1");
        manager.addMovie("film2");
        manager.addMovie("film3");

        String[] expected = {"film1", "film2", "film3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testNoAdd() {
        MovieManager manager = new MovieManager();


        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddOne() {
        MovieManager manager = new MovieManager();
        manager.addMovie("film1");

        String[] expected = {"film1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testEqualsLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie("film1");
        manager.addMovie("film2");
        manager.addMovie("film3");
        manager.addMovie("film4");
        manager.addMovie("film5");

        String[] expected = {"film1", "film2", "film3", "film4", "film5"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindOverLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie("film1");
        manager.addMovie("film2");
        manager.addMovie("film3");
        manager.addMovie("film4");
        manager.addMovie("film5");
        manager.addMovie("film6");
        manager.addMovie("film7");

        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastOverLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie("film1");
        manager.addMovie("film2");
        manager.addMovie("film3");
        manager.addMovie("film4");
        manager.addMovie("film5");
        manager.addMovie("film6");
        manager.addMovie("film7");

        String[] expected = {"film7", "film6", "film5", "film4", "film3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie("film1");
        manager.addMovie("film2");
        manager.addMovie("film3");
        manager.addMovie("film4");
        manager.addMovie("film5");

        String[] expected = {"film5", "film4", "film3", "film2", "film1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastLessLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie("film1");
        manager.addMovie("film2");


        String[] expected = {"film2", "film1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
