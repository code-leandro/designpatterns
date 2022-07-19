package facade;

public class Client {

    public static void main(String[] args) {
        VideoConverter videoConverter = new VideoConverter();
        videoConverter.converter("myFile", "mp4");
    }
}
