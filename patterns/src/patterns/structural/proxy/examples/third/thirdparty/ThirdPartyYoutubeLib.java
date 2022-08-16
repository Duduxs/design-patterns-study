package patterns.structural.proxy.examples.third.thirdparty;

import java.util.HashMap;
import java.util.Map;

public interface ThirdPartyYoutubeLib {

    Map<String, Video> popularVideos();

    Video getVideo(String videoId);

}
