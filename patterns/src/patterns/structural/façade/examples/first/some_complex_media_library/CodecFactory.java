package patterns.structural.façade.examples.first.some_complex_media_library;

public class CodecFactory {

    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();

        if(type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPE4CompressionCodec();
        } else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
