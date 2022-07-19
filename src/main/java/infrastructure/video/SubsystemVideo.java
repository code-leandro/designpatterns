package infrastructure.video;

import domain.port.SubsystemFilePort;
import domain.video.FileVideo;

public class SubsystemVideo implements SubsystemFilePort {

    @Override
    public void exportFile(FileVideo fileVideo) {
        System.out.println("Exporting file through SubsystemVideo ...");
    }
}
