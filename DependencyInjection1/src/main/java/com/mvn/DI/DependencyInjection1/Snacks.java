package com.mvn.DI.DependencyInjection1;

public class Snacks {
	private String Biscates;
	private String Kurkure;
	private Chocolates Chocolates;
	public Snacks() {
		
	}
	public Snacks(String Biscates, String Kurkure, Chocolates Chocolates) {
		this.Biscates=Biscates;
		this.Kurkure=Kurkure;
		this.Chocolates=Chocolates;
	}   
	public void setBiscates(String Biscates) {
		this.Biscates=Biscates;
	}
	public String getBiscates() {
		return this.Biscates=Biscates;
	}
	public void setKurkure(String Kurkure) {
		this.Kurkure=Kurkure;
	}
	public String getKurkure() {
		return this.Kurkure=Kurkure;
	}
	public void setChocolates(Chocolates Chocolates) {
		this.Chocolates=Chocolates;
	}
	public Chocolates getChocolates() {
		return this.Chocolates=Chocolates;
	}
}
