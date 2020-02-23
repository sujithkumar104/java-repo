package com.concepts.designpatterns.factorypattern;

public class PatternFactory {
	
	public Plan getPlan(String planType) {
		if(planType.equalsIgnoreCase("Domestic")) {
			return new DomesticPlan();
		}else if(planType.equalsIgnoreCase("Commerical")) {
			return new CommercialPlan();
		}else if(planType.contentEquals("Institutional")){
		    return new InstitutionalPlan();	
		}else {
			return null;
		}
	}

}
