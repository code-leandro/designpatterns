package factorymethod;

import domain.video.Converter;
import domain.video.MPEG4CompressionCodec;
import domain.video.OggCompressionCodec;

public class ConvertorCreator {

    public Converter createConverter(String type) {
        if (type.equals("mp4"))
            return new MPEG4CompressionCodec();

        if (type.equals("ogg"))
            return new OggCompressionCodec();

        return null;
    }
}
