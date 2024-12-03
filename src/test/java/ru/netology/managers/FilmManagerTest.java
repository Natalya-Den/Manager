package ru.netology.managers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {
    private int limit = 3;

    @Test
    void doNotAddFilmTest() {
        FilmManager manager = new FilmManager();

        String[] expected = { };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void add1FilmTest() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Бладшот");
        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void addSomeFilmTest() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Джентльмены");

        String[] expected = {"Бладшот", "Вперед", "Джентльмены"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findLast4FilmsWithoutSetLimitTest() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Джентльмены");
        manager.addFilm("Отель Белград");

        String[] expected = {"Отель Белград", "Джентльмены", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findLast5FilmsWithoutSetLimitTest() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Джентльмены");
        manager.addFilm("Отель Белград");
        manager.addFilm("Человек-невидимка");

        String[] expected = {"Человек-невидимка", "Отель Белград", "Джентльмены", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findLast6FilmsWithoutSetLimitTest() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Джентльмены");
        manager.addFilm("Отель Белград");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Номер один");

        String[] expected = {"Номер один", "Человек-невидимка", "Отель Белград", "Джентльмены", "Вперед"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findLast2FilmsWithLimit3Test() {
        FilmManager manager = new FilmManager(limit);

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");

        String[] expected = {"Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findLast3FilmsWithLimit3Test() {
        FilmManager manager = new FilmManager(limit);

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Джентльмены");

        String[] expected = {"Джентльмены", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findLastFilmsWithLimit3Test() {
        FilmManager manager = new FilmManager(limit);

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Джентльмены");
        manager.addFilm("Отель Белград");

        String[] expected = {"Отель Белград", "Джентльмены", "Вперед"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}