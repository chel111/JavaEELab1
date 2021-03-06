package com.chel.lab1.model;


import com.chel.lab1.dao.RaceDao;
import com.chel.lab1.dao.RiderDao;
import com.chel.lab1.entities.Race;
import com.chel.lab1.entities.Rider;

import java.util.ArrayList;


public class RiderModel {
    private static RiderModel instance = RiderModel.getInstance();

    private RiderModel() { };

    public static RiderModel getInstance() {
        return instance;
    }


    private static RiderDao riderDao = RiderDao.getInstance();

    public ArrayList<Rider> getAllRaces() {
        return riderDao.getAll();
    }


    public ArrayList<Rider> getRidersForRace(int raceId) {
        return riderDao.getAllForRace(raceId);
    }

    public Rider getRiderById(int id) {
        return riderDao.get(id);
     }

    public void deleteRiderById(int id) {
        riderDao.delete(id);
     }

}
