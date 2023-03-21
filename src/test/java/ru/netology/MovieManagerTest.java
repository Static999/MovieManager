package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    @Test
    public void testAddMore() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");

        String[] expected = {"Film I", "Film II", "Film III"};
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

        manager.addMovie("Film I");

        String[] expected = {"Film I"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testReturnLast() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");

        String[] expected = {"Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
