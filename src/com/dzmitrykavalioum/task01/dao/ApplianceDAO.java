package com.dzmitrykavalioum.task01.dao;

import com.dzmitrykavalioum.task01.entity.Appliance;
import com.dzmitrykavalioum.task01.entity.criteria.Criteria;

public interface ApplianceDAO {
	Appliance find(Criteria criteria);
}
