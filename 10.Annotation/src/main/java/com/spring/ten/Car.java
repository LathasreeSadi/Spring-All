package com.spring.ten;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	@Autowired
	@Qualifier("models")
	private Model model;

	/*
	 * public Car() { super(); } //@Autowired public Car(Model model) { super();
	 * this.model=model; System.out.println("This is Constructor"); } //@Autowired
	 * public void setModel(Model model) {
	 * System.out.println("This is Setter Method.."); this.model=model; } public
	 * Model getModel() { return this.model; }
	 */	public void CarStarted() {
		if(model !=null) {
			model.Start();
			System.out.println(" Id: "+model.getId());
			System.out.println(" Name: "+model.getName());
			System.out.println(" Model: "+model.getModel());
		}
		else
		{
			System.out.println("🚗 Not Started..");
			
		}
	}
}
