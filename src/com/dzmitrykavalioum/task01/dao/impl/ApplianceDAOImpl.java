package com.dzmitrykavalioum.task01.dao.impl;

import com.dzmitrykavalioum.task01.dao.ApplianceDAO;
import com.dzmitrykavalioum.task01.entity.*;
import com.dzmitrykavalioum.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ApplianceDAOImpl implements ApplianceDAO {

    private static final String FILE_PATH = "appliances_db.txt";

    @Override
    public Appliance find(Criteria criteria) {

        //TODO return List<Appliance> (if founded more than one item by criteria)

        boolean isLineOk = false;
        Appliance appliance = null;

        try {
            File file = new File(FILE_PATH);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String applianceLine = bufferedReader.readLine();

            while (applianceLine != null) {
                isLineOk = false;
                criteria.setBeginning();

                if (applianceLine.indexOf(criteria.getTypeAppliance()) < 0) {
                    applianceLine = bufferedReader.readLine();
                    continue;
                }

                String currentCriteria = criteria.getCriteria();
                while (currentCriteria != null) {
                    if (applianceLine.replace(",", " ").indexOf(currentCriteria) >= 0) {
                        isLineOk = true;
                    } else {
                        isLineOk = false;
                        break;
                    }
                    currentCriteria = criteria.getCriteria();

                }

                if (isLineOk) {
                    String product[] = applianceLine.substring(criteria.getTypeAppliance().length() + 3).split("=|, ");
                    switch (criteria.getTypeAppliance()) {
                        case "Laptop":
                            appliance = new Laptop.LaptopBuilder(product).build();
                            break;
                        case "Oven":
                            appliance = new Oven.OvenBuilder(product).build();
                            break;
                        case "Refrigerator":
                            appliance = new Refrigerator.RefrigeratorBuilder(product).build();
                            break;
                        case "Speakers":
                            appliance = new Speakers.SpeakersBuilder(product).build();
                            break;
                        case "TabletPc":
                            appliance = new TabletPc.TabletPcBuilder(product).build();
                            break;
                        case "VacuumCleaner":
                            appliance = new VacuumCleaner.VacuumCleanerBuilder(product).build();
                            break;
                        default:
                            break;
                    }
                }
                applianceLine = bufferedReader.readLine();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return appliance;
    }
}


//you may add your own new classes