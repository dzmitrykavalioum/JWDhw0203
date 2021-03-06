package com.dzmitrykavalioum.task01.dao;

import com.dzmitrykavalioum.task01.entity.Appliance;
import com.dzmitrykavalioum.task01.entity.criteria.Criteria;

import java.io.IOException;

public interface ApplianceDAO {
	Appliance find(Criteria criteria) throws IOException;
}
