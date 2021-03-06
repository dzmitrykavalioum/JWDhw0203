package com.dzmitrykavalioum.task01.entity.criteria;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Criteria {

    private String typeAppliance;
    private Map<String, Object> criteria = new HashMap<String, Object>();
    private Iterator<Map.Entry<String, Object>> iterator;

    public Criteria(String typeAppliance) {
        this.typeAppliance = typeAppliance;
    }

    public String getTypeAppliance() {
        return typeAppliance;
    }

    public void add(String searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }

    public String getCriteria() {

        if (iterator.hasNext()) {
            Map.Entry<String, Object> entry = iterator.next();

            return " " + entry.getKey() + "=" + entry.getValue() + " ";
        } else {
            iterator = criteria.entrySet().iterator();
        }
        return null;
    }

    public void setBeginning() {
        iterator = criteria.entrySet().iterator();
    }


}
