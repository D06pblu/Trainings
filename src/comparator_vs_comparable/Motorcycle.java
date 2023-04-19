package comparator_vs_comparable;

public class Motorcycle implements Comparable<Motorcycle>{
    private String producer;
    private String model;
    private int modelProductionStart;
    private int manufactureYear;
    private int wetWeight;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getModelProductionStart() {
        return modelProductionStart;
    }

    public void setModelProductionStart(int modelProductionStart) {
        this.modelProductionStart = modelProductionStart;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getWetWeight() {
        return wetWeight;
    }

    public void setWetWeight(int wetWeight) {
        this.wetWeight = wetWeight;
    }

    public Motorcycle(String producer, String model, int manufactureYear, int wetWeight) {
        this.producer = producer;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.wetWeight = wetWeight;
    }


    @Override
    public String toString() {
        return "Motorcycle{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", modelProductionStart=" + modelProductionStart +
                ", manufactureYear=" + manufactureYear +
                ", wetWeight=" + wetWeight +
                '}';
    }

    @Override
    public int compareTo(Motorcycle otherMotorcycle) {
        return Integer.compare(otherMotorcycle.getWetWeight(), getWetWeight());
    }
}
