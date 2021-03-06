package com.dzmitrykavalioum.task01.service.impl;

import com.dzmitrykavalioum.task01.dao.ApplianceDAO;
import com.dzmitrykavalioum.task01.dao.DAOFactory;
import com.dzmitrykavalioum.task01.entity.Appliance;
import com.dzmitrykavalioum.task01.entity.criteria.Criteria;
import com.dzmitrykavalioum.task01.service.ApplianceService;
import com.dzmitrykavalioum.task01.service.validation.Validator;

import java.io.IOException;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public Appliance find(Criteria criteria) throws IOException {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		Appliance appliance = applianceDAO.find(criteria);

		return appliance;
	}

}

