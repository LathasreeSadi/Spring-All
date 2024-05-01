package com.mvn.DI.DependencyInjection1;

public class Chocolates {
	private String Dairymilk;
	private String Fivestar;
	private String Munch;
	private String Perk;
	public Chocolates() {
		
	}
	public Chocolates(String Dairymilk, String Fivestar, String Munch, String Perk) {
		this.Dairymilk=Dairymilk;
		this.Fivestar=Fivestar;
		this.Munch=Munch;
		this.Perk=Perk;
	}
	public void setDairymilk(String Dairymilk) {
		this.Dairymilk=Dairymilk;
	}
	public String getDairymilk() {
		return this.Dairymilk=Dairymilk;
	}
	public void setFivestar(String Fivestar) {
		this.Fivestar=Fivestar;
	}
	public String getFivestar() {
		return this.Fivestar=Fivestar;
	}
	public void setMunch(String Munch) {
		this.Munch=Munch;
	}
	public String getMunch() {
		return this.Munch=Munch;
	}
	public void setPerk(String Perk) {
		this.Perk=Perk;
	}
	public String getPerk() {
		return this.Perk=Perk;
	}
}
