package usecase.domain.video;

public class OggCompressionCodec extends Converter {

    @Override
    public FileVideo execute(String file, String format) {
        System.out.println("Converting OGG...");
        return null;
    }
}
