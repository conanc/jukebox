package conan.rocks.domain;

public class Track {

    private String trackId;
    private byte[] trackData;

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public byte[] getTrackData() {
        return trackData;
    }

    public void setTrackData(byte[] trackData) {
        this.trackData = trackData;
    }
}
