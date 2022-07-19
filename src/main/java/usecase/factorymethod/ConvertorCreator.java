package usecase.factorymethod;

import usecase.domain.video.Converter;
import usecase.domain.video.MPEG4CompressionCodec;
import usecase.domain.video.OggCompressionCodec;

public class ConvertorCreator {

    public Converter createConverter(String type) {
        if (type.equals("mp4"))
            return new MPEG4CompressionCodec();

        if (type.equals("ogg"))
            return new OggCompressionCodec();

        return null;
    }
}
