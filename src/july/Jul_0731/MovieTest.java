package july.Jul_0731;

public class MovieTest {
    public static void main(String[] args) {
        Movie firstMovie = new Movie();
        firstMovie.title = "아바타";
        firstMovie.openDate = "2025.12.22";
        firstMovie.mainActor = "제이크";
        firstMovie.janre = "액션";
        firstMovie.runningTime = 122;
        firstMovie.grade = "12세";

        Movie secondMovie = new Movie();
        secondMovie.title = "아바타2";
        secondMovie.openDate = "2027.12.22";
        secondMovie.mainActor = "제이크";
        secondMovie.janre = "액션";
        secondMovie.runningTime = 150;
        secondMovie.grade = "15세";

        Movie[] abataSeries = new Movie[2];
        abataSeries[0] = firstMovie;
        abataSeries[1] = secondMovie;

        for(Movie movie : abataSeries){
            System.out.println(movie.title);
        }
    }
}
