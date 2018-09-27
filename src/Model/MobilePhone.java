package Model;
import javafx.scene.image.Image;

import java.sql.SQLException;
import java.util.ArrayList;

public class MobilePhone {
    private String make, model,os;
    private double screenSize, memory, frontCameraRes, rearCameraRes, price;
    private Image photoImage;

    public MobilePhone(String make, String model, String os) {
        try {
            setMake(make);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        setModel(model);
        setOs(os);
    }

    public MobilePhone(String make, String model, String os, double screenSize, double memory, double frontCameraRes, double rearCameraRes, double price) {
        this(make, model, os);
        setScreenSize(screenSize);
        setMemory(memory);
        setFrontCameraRes(frontCameraRes);
        setRearCameraRes(rearCameraRes);
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) throws SQLException {
        ArrayList<String> validMakes = DBConnect.getPhoneManufacturers();
        if (validMakes.contains(make));
            this.make = make;

        throw new IllegalArgumentException("Valid makes are: "+validMakes);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public double getFrontCameraRes() {
        return frontCameraRes;
    }

    public void setFrontCameraRes(double frontCameraRes) {
        this.frontCameraRes = frontCameraRes;
    }

    public double getRearCameraRes() {
        return rearCameraRes;
    }

    public void setRearCameraRes(double rearCameraRes) {
        this.rearCameraRes = rearCameraRes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
