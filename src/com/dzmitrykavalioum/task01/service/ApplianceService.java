package com.dzmitrykavalioum.task01.service;

import com.dzmitrykavalioum.task01.entity.Appliance;
import com.dzmitrykavalioum.task01.entity.criteria.Criteria;

import java.io.IOException;

public interface ApplianceService {	
	
	Appliance find(Criteria criteria) throws IOException;
	
}
