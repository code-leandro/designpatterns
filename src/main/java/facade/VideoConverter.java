package facade;

import domain.port.SubsystemFilePort;
import domain.video.Converter;
import domain.video.FileVideo;
import factorymethod.ConvertorCreator;

public class VideoConverter {

    SubsystemFilePort subsystemFilePort;

    ConvertorCreator convertorVideoFactory = new ConvertorCreator();

    public void converter(String file, String format) {

        Converter converter = convertorVideoFactory.createConverter(format);
        FileVideo fileConverted = converter.execute(file, format);
        subsystemFilePort.exportFile(fileConverted);
    }
}
