package infrastructure.video;

import usecase.port.SubsystemFilePort;
import domain.video.FileVideo;

public class SubsystemVideoAdapter implements SubsystemFilePort {

    @Override
    public void exportFile(FileVideo fileVideo) {
        System.out.println("Exporting file through SubsystemVideo ...");
    }
}
