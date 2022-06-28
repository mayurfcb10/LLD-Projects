package com.carrental;

import com.carrental.product.Vehicle;
import com.carrental.product.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Store {
    String storeId;
    VehicleInventoryManagement inventoryManagement;
    Location storeLocation;
    List<Reservation> reservations = new ArrayList<>();

    // addVehicles, update Vehicles, use inventory management to update those
    public List<Vehicle> getVehicles(VehicleType vehicleType) {
        return inventoryManagement.getVehicleList();
    }

    public void setVehicles(List<Vehicle> vehicles) {
        inventoryManagement = new VehicleInventoryManagement(vehicles);
    }

    public Reservation createReservation(Vehicle vehicle, User user) {
        Reservation reservation = new Reservation();
        reservation.createReservation(vehicle, user);
        reservations.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationId) {
        // take our the reservation from the list and call the complete reservation method
        return true;
    }

    // update reservation
}
