public class assigment13 {

    public static void main(String[] args) {

        Movie m1 = new Movie("Toxic", "Yash");
        Movie m2 = new Movie("KGF", "Hombale Films", "4 star");
        Movie m3 = new Movie("Salaar", "Hombale Films");
        Movie m4 = new Movie("Kantara", "Hombale Films");

        Movie[] movies = {m1, m2, m3, m4};

        Movie[] fiveStar = get5StarMovies(movies);

        for(int i = 0; i < fiveStar.length; i++) {
            if(fiveStar[i] != null) {
                System.out.println(fiveStar[i].getTitle());
            }
        }
    }

    public static Movie[] get5StarMovies(Movie[] movies) {

        int count = 0;

        // Count 5 star movies
        for(int i = 0; i < movies.length; i++) {

            if(movies[i].getRating().equals("5 star")) {
                count++;
            }
        }

        // Create new array
        Movie[] result = new Movie[count];

        int j = 0;

        // Store 5 star movies
        for(int i = 0; i < movies.length; i++) {

            if(movies[i].getRating().equals("5 star")) {
                result[j] = movies[i];
                j++;
            }
        }

        return result;
    }
}


class Movie {

    private String title;
    private String studio;
    private String rating;

    // Constructor 1
    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    // Constructor 2
    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "5 star";
    }

    public String getTitle() {
        return title;
    }

    public String getStudio() {
        return studio;
    }

    public String getRating() {
        return rating;
    }
}