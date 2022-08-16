package patterns.structural.proxy.examples.third.thirdparty;

import java.util.HashMap;
import java.util.Map;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {

    @Override
    public Map<String, Video> popularVideos() {
        connectToServer("http://youtube.com");

        System.out.println("Downloading populars...");

        experienceNetworkLatency();
        Map<String, Video> videos = new HashMap<>(
                Map.of(
                        "1", new Video("123", "Rabbits dancing.avi"),
                        "2", new Video("456", "Dog play with ball.mp4"),
                        "3", new Video("7701", "Dancing video.mpq"),
                        "4", new Video("4023", "Barcelona vs Real Madrid.mov"),
                        "5", new Video("9090", "Programing lesson.avi")
                )
        );

        return videos;
    }

    @Override
    public Video getVideo(String videoId) {
        connectToServer("http://youtube.com");

        System.out.println("Downloading video...");

        experienceNetworkLatency();

        Video video = new Video(videoId, "Some video title");

        System.out.println("Done \n");

        return video;

    }

    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);

        for(int i = 0; i < randomLatency; i++) {
            try { Thread.sleep(1000); }
            catch (InterruptedException e) { e.printStackTrace(); }
        }

    }

    private void connectToServer(String server) {
        System.out.println("Connecting to " + server + "...");
        experienceNetworkLatency();
        System.out.println("Connected \n");
    }
}
