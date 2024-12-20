 class Movie implements Comparable<Movie>{

    String title;
    double  rating;

    public Movie(String title, double rating){
        this.title=title;
        this.rating=rating;
    }
     @Override
     public String toString() {
         return title + " (" + rating + ")";
     }
     @Override
     public int compareTo(Movie other) {
         return Double.compare(this.rating, other.rating);
     }
     }

