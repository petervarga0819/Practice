package Practice;

public class PostItObjects {

    public static void main(String[] args) {

        PostIt postIt1;
        postIt1 = new PostIt();

        postIt1.backGroundColor = "orange";
        postIt1.text = "Idea 1";
        postIt1.textColor = "blue";

        PostIt postIt2;
        postIt2 = new PostIt();

        postIt2.backGroundColor = "pink";
        postIt2.text = "Awesome";
        postIt2.textColor = "black";

        PostIt postIt3;
        postIt3 = new PostIt();

        postIt3.backGroundColor = "yellow";
        postIt3.textColor = "green";
        postIt3.text = "Superb";
    }
}
