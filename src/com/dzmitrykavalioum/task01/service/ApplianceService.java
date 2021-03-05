package com.dzmitrykavalioum.task01.service;

import com.dzmitrykavalioum.task01.entity.Appliance;
import com.dzmitrykavalioum.task01.entity.criteria.Criteria;

public interface ApplianceService {	
	
	Appliance find(Criteria criteria);
	
}
