package com.dzmitrykavalioum.task01.main;

import static com.dzmitrykavalioum.task01.entity.criteria.SearchCriteria.*;

import com.dzmitrykavalioum.task01.entity.Appliance;
import com.dzmitrykavalioum.task01.entity.Laptop;
import com.dzmitrykavalioum.task01.entity.TabletPc;
import com.dzmitrykavalioum.task01.entity.criteria.Criteria;
import com.dzmitrykavalioum.task01.entity.criteria.SearchCriteria;
import com.dzmitrykavalioum.task01.service.ApplianceService;
import com.dzmitrykavalioum.task01.service.ServiceFactory;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Appliance appliance;
        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService applianceService = factory.getApplianceService();
		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.CAPACITY.toString(), 33);
		criteriaOven.add(Oven.HEIGHT.toString(), 40);

		appliance = applianceService.find(criteriaOven);
		PrintApplianceInfo.print(appliance);

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.HEIGHT.toString(), 45.5);
		criteriaOven.add(Oven.WIDTH.toString(), 59.5);

		appliance = applianceService.find(criteriaOven);
		PrintApplianceInfo.print(appliance);

        Criteria criteriaLaptop = new Criteria(Laptop.class.getSimpleName());
        criteriaLaptop.add(SearchCriteria.Laptop.OS.name(), "Windows");
        appliance = applianceService.find(criteriaLaptop);
        PrintApplianceInfo.print(appliance);

        Criteria criteriaTabletPc = new Criteria("TabletPC");
        criteriaTabletPc.add(SearchCriteria.TabletPc.BATTERY_CAPACITY.name(), 4);
        appliance = applianceService.find(criteriaTabletPc);
        PrintApplianceInfo.print(appliance);


    }

}
