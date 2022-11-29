package ru.netology.afisha;

import ru.netology.domain.ListFilms;

public class Main {

    public static void main(String[] args) {

        ListFilms film1 = new ListFilms(101, 1, "Бладшот", 700, 5);
        ListFilms film2 = new ListFilms(102, 2, "Вперёд", 700, 5);
        ListFilms film3 = new ListFilms(103, 3, "Отель Белград", 500, 3);
        ListFilms film4 = new ListFilms(104, 4, "Джентльмены", 700, 5);
        ListFilms film5 = new ListFilms(105, 5, "Человек-невидимка", 300, 1);
        ListFilms film6 = new ListFilms(106, 6, "Тролли.Мировой тур", 300, 1);
        ListFilms film7 = new ListFilms(107, 7, "Номер один", 300, 1);
        ListFilms film8 = new ListFilms(108, 8, "Аватар", 700, 5);
        ListFilms film9 = new ListFilms(109, 9, "Холоп", 600, 4);
        ListFilms film10 = new ListFilms(110, 10, "Вышка", 400, 2);

        ListFilmsManager manager = new ListFilmsManager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);

        ListFilms[] all = manager.findLast();

    }

}