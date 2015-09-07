package lv.javaguru.java2.database;

import lv.javaguru.java2.domain.Accessory;

import java.util.List;

/**
 * Created by VK on 2015.07.22..
 */

public interface AccessoryDAO {

    List<Accessory> getAll(String availableFor) throws DBException;
}
