package patterns.structural.proxy.examples.third.thirdparty;

public class Video {

    public String id;
    public String title;
    public String data;

    public Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }
}
