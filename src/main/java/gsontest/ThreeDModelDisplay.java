package gsontest;

public class ThreeDModelDisplay extends Display {
    private String modelName;
    private Boolean isTracked;


    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Boolean getTracked() {
        return isTracked;
    }

    public void setTracked(Boolean tracked) {
        isTracked = tracked;
    }

    @Override
    public String toString() {
        return "ThreeDModelDisplay{" +
                "modelName='" + modelName + '\'' +
                ", isTracked=" + isTracked +
                '}';
    }
}
