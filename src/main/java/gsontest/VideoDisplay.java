package gsontest;

public class VideoDisplay extends Display{
    private String videoFile;

    public VideoDisplay() {
        this("Video");
    }

    public VideoDisplay(String name) {
        super(name);
    }

    public String getVideoFile() {
        return videoFile;
    }

    public void setVideoFile(String videoFile) {
        this.videoFile = videoFile;
    }

    @Override
    public String toString() {
        return "VideoDisplay{" +
                "videoFile='" + videoFile + '\'' +
                '}';
    }
}
