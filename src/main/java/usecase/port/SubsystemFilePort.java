package usecase.port;

import usecase.domain.video.FileVideo;

public interface SubsystemFilePort {
    void exportFile(FileVideo fileVideo);
}
