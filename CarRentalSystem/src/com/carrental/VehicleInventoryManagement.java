package com.carrental;

import com.carrental.product.Vehicle;
import java.util.List;

public class VehicleInventoryManagement {
    List<Vehicle> vehicleList;

    public VehicleInventoryManagement(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }
}
