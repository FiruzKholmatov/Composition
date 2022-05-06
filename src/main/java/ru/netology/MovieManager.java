package ru.netology;

public class MovieManager {


    private MovieItem[] items = new MovieItem[0];

    public MovieManager(int length) {
        MovieItem[] items = new MovieItem[length];
    }

    public MovieManager() {
    }


    public void save(MovieItem item) {
        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieItem[] findAll() {

        MovieItem[] result = new MovieItem[items.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = items[i];
        }
        return result;
    }

    public MovieItem[] findLast() {
        int resultLength;
        if (items.length < 10) {
            resultLength = items.length;
        } else {
            resultLength = 10;
        }
        MovieItem[] result = new MovieItem[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }


}
