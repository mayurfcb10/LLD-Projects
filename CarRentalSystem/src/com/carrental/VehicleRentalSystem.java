package com.carrental;

import java.util.List;

public class VehicleRentalSystem {
    List<Store> storeList;
    List<User> userList;

    public VehicleRentalSystem(List<Store> storeList, List<User> userList) {
        this.storeList = storeList;
        this.userList = userList;
    }

    public Store getStore(Location location) {
        // based on location we will filter our store from the store List
        return storeList.get(0);
    }

    // add users

    // remove users

    // add stores

    // remove stores
}
