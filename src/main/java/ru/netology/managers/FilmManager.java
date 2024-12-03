package ru.netology.managers;

public class FilmManager {
    private String[] films = new String[0];
    private int limitFindLast;

    public FilmManager(){
        this.limitFindLast = 5;
    }

    public FilmManager(int resultLength){
        this.limitFindLast = resultLength;
    }


    public void addFilm(String film){
        String[] tmp = new String[films.length + 1];

        for (int i = 0; i < films.length; i++){
            tmp[i] = films[i];
        }
        tmp[tmp.length-1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;

        if (films.length < limitFindLast) {
            resultLength = films.length;
        } else {
            resultLength = limitFindLast;
        }
        String[] temp = new String[resultLength];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = films[films.length - 1 - i];
        }
        return temp;
    }
}
