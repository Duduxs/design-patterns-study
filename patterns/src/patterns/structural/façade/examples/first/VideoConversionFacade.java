package patterns.structural.façade.examples.first;

import patterns.structural.façade.examples.first.some_complex_media_library.*;

import java.io.File;

public class VideoConversionFacade {

    public File convertVideo(String fileName, String format) throws InterruptedException {
        System.out.println("VideoConversionFacade: conversion started.");

        Thread.sleep(3000);

        VideoFile file = new VideoFile(fileName);

        Codec sourceCodec = CodecFactory.extract(file);
        Thread.sleep(3000);
        Codec destinationCodec;

        if(format.equals("mp4")) {
            destinationCodec = new MPE4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }

        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        Thread.sleep(4500);

        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        Thread.sleep(6000);

        File result = (new AudioMixer().fix(intermediateResult));

        Thread.sleep(2000);

        System.out.println("VideoConversionFacade: conversion completed.");

        return result;

    }

}
