package patterns.structural.proxy.examples.third.thirdparty;

public class YoutubeDownloader {

    private ThirdPartyYoutubeLib api;

    public YoutubeDownloader(ThirdPartyYoutubeLib api) {
        this.api = api;
    }

    public void renderVideoPage(String videoId) {
        var video = api.getVideo(videoId);

        System.out.println("\n----------------------");
        System.out.println("Video Page");
        System.out.println("ID: " + videoId);
        System.out.println("Title: " + video.title);
        System.out.println("Video: " + video.data);
        System.out.println("\n----------------------");

    }

    public void renderPopularVideos() {
        var list = api.popularVideos();

        System.out.println("\n----------------------");
        System.out.println("Most popular videos on Yotuube");
        list.values().forEach(v -> System.out.println("ID: " + v.id + " / Title: " + v.title));
        System.out.println("\n----------------------");

    }

}
