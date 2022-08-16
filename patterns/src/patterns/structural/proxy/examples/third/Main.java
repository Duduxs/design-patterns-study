package patterns.structural.proxy.examples.third;

import patterns.structural.proxy.examples.third.proxy.YoutubeCacheProxy;
import patterns.structural.proxy.examples.third.thirdparty.ThirdPartyYoutubeClass;
import patterns.structural.proxy.examples.third.thirdparty.YoutubeDownloader;

/**
 * Proxy with library video
 */
public class Main {

    public static void main(String[] args) {

        YoutubeDownloader naiveDownloader = new YoutubeDownloader(new ThirdPartyYoutubeClass());
        YoutubeDownloader smartDownloader = new YoutubeDownloader(new YoutubeCacheProxy());

        System.out.println("\n\nMaking tests with naive downloader\n\n");
        long naive = testPerfomance(naiveDownloader);
        System.out.println("\n\nMaking tests with smart downloader\n\n");
        long smart = testPerfomance(smartDownloader);

        System.out.println("\n\n Time saved by caching proxy: " + (naive - smart) + "ms");

    }

    private static long testPerfomance(YoutubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        downloader.renderPopularVideos();
        downloader.renderVideoPage("13130412");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("13121021");

        downloader.renderVideoPage("13130412");
        downloader.renderVideoPage("99999999");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }

}
