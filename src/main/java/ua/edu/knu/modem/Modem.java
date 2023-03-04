package ua.edu.knu.modem;

public class Modem {
    private String serialNumber;
    private String manufacturer;
    private String modelName;
    private String type;
    private double priceInUsd;
    private double powerConsumptionInWatts;
    private String connectionInterface;
    private String transmissionMedium;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPriceInUsd() {
        return priceInUsd;
    }

    public void setPriceInUsd(double priceInUsd) {
        this.priceInUsd = priceInUsd;
    }

    public double getPowerConsumptionInWatts() {
        return powerConsumptionInWatts;
    }

    public void setPowerConsumptionInWatts(double powerConsumptionInWatts) {
        this.powerConsumptionInWatts = powerConsumptionInWatts;
    }

    public String getConnectionInterface() {
        return connectionInterface;
    }

    public void setConnectionInterface(String connectionInterface) {
        this.connectionInterface = connectionInterface;
    }

    public String getTransmissionMedium() {
        return transmissionMedium;
    }

    public void setTransmissionMedium(String transmissionMedium) {
        this.transmissionMedium = transmissionMedium;
    }
}
