package patterns.structural.façade.examples.first.some_complex_media_library;

import java.io.File;

public class AudioMixer {

    public File fix(VideoFile result) {
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }

}
