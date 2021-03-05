package com.dzmitrykavalioum.task01.service.impl;

import com.dzmitrykavalioum.task01.dao.ApplianceDAO;
import com.dzmitrykavalioum.task01.dao.DAOFactory;
import com.dzmitrykavalioum.task01.entity.Appliance;
import com.dzmitrykavalioum.task01.entity.criteria.Criteria;
import com.dzmitrykavalioum.task01.service.ApplianceService;
import com.dzmitrykavalioum.task01.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public Appliance find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		Appliance appliance = applianceDAO.find(criteria);
		
		// you may add your own code here
		
		return appliance;
	}

}

//you may add your own new classes
