package patterns.structural.façade.examples.first.some_complex_media_library;

public class BitrateReader {

    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: writing file...");
        return file;
    }

}
