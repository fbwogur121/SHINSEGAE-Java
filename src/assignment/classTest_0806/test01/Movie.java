package assignment.classTest_0806.test01;

public class Movie {
    private static String title;
    private static String genre;

    public static void play() {
        System.out.println(title + "(" + genre + ")" + "상영중입니다.");
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
