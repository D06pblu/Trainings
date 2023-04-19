package gof_pattrens.creational.prototype;

public class Biulding implements Copyable{
    private int buildYear;
    private int floorCount;
    private String modelName;

    public Biulding(int buildYear, int floorCount, String modelName) {
        this.buildYear = buildYear;
        this.floorCount = floorCount;
        this.modelName = modelName;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public Object copy() {
        Biulding duplicate = new Biulding(buildYear, floorCount, modelName);
        return duplicate;
    }

    @Override
    public String toString() {
        return "Biulding{" +
                "buildYear=" + buildYear +
                ", floorCount=" + floorCount +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}
