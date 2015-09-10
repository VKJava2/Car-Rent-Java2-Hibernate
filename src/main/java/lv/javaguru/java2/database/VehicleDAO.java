package lv.javaguru.java2.database;

import lv.javaguru.java2.domain.Vehicle;

import java.util.List;

/**
 * Created by Kano on 2015.09.10..
 */

public interface VehicleDAO<VehicleType, FilterParameter> {

    void create(VehicleType  currentVehicle) throws DBException;

    void delete(String id) throws DBException;

    void update(String id) throws DBException;

    List<Vehicle> getAll(VehicleType currentVehicle) throws DBException;

    Vehicle getById(String id) throws DBException;

    List<Vehicle> filterByParameter (String vehicleType, String parameter, String paramererValue) throws DBException;
}
