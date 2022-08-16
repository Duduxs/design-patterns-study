package patterns.structural.proxy.examples.third.proxy;

import patterns.structural.proxy.examples.third.thirdparty.ThirdPartyYoutubeClass;
import patterns.structural.proxy.examples.third.thirdparty.ThirdPartyYoutubeLib;
import patterns.structural.proxy.examples.third.thirdparty.Video;

import java.util.HashMap;
import java.util.Map;

public class YoutubeCacheProxy implements ThirdPartyYoutubeLib {

    private ThirdPartyYoutubeLib wrapper = new ThirdPartyYoutubeClass();

    private Map<String, Video> cachePopular = new HashMap<String, Video>();
    private Map<String, Video> cacheAll = new HashMap<String, Video>();

    @Override
    public Map<String, Video> popularVideos() {

        if(cachePopular.isEmpty()) {
            cachePopular = wrapper.popularVideos();
        } else {
            System.out.println("Retrieved list from cache");
        }

        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {

        var video = cacheAll.get(videoId);

        if(video == null) {
            video = wrapper.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video " + video.title + " from cache");
        }

        return video;
    }

    public void resetCache() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
