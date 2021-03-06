package com.dzmitrykavalioum.task01.main;

import com.dzmitrykavalioum.task01.entity.Appliance;

public class PrintApplianceInfo {
	
	public static void print(Appliance appliance) {
		if (appliance != null) {
			System.out.println(appliance.toString()+"\n");
		} else {
			System.out.println("Nothing found for this query\n");
		}
		
	}
	


}
