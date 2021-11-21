package domain;

public class movieManager {
    private String title;
    private int lengthReturn;
    private final int maxReturn = 10;
    private String[] poster;

    public movieManager(int lengthReturn) {
        this.lengthReturn = lengthReturn;
    }

    public movieManager() {
    }

    public String[] getPoster(String[] poster) {
        return poster;
    }


    public String[] addMovie(String title, String[] poster) {
        String[] tmp = new String[poster.length + 1];
        for (int i = 0; i < poster.length; i++) {
            tmp[i] = poster[i];
        }
        tmp[tmp.length - 1] = title;

        poster = tmp;
        return poster;
    }

    public String[] showAddedMovies(String[] poster) {

        if (lengthReturn > maxReturn) {
            lengthReturn = maxReturn;
        }
        int recover = 0;


        if (poster.length < lengthReturn) {
            recover = poster.length;
        } else {
            recover = lengthReturn;
        }
        String[] tmp = new String[recover];
        int indexTo = 0;

        for (int indexFrom = 0; indexFrom < lengthReturn; indexFrom++) {
            tmp[indexTo] = poster[poster.length - (1 + indexTo)];
            indexTo++;
            if (indexTo == recover) break;
        }
        return tmp;
    }
}

