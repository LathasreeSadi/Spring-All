package com.mvn.DI.DependencyInjection1;

public class Food {
	private String Biryani;
	private String StreetFood;
	private Snacks Snacks;
	public Food() {
		
	}
	public Food(String Biryani, String StreetFood, Snacks Snacks) {
		this.Biryani=Biryani;
		this.StreetFood=StreetFood;
		this.Snacks=Snacks;
	}
	public void setBiryani(String Biryani) {
		this.Biryani=Biryani;
	}
	public String getBiryani()
	{
		return this.Biryani=Biryani;
	}
	public void setStreetFood(String StreetFood) {
		this.StreetFood=StreetFood;
	}
	public String getStreetFood() {
		return this.StreetFood=StreetFood;
	}
	public void setSnacks(Snacks Snacks) {
		this.Snacks=Snacks;
	}
	public Snacks getSnacks() {
		return this.Snacks=Snacks;
	}
	public void print()
	{
		System.out.println("\nFood: ");
		System.out.println("Biryani: "+Biryani);
		System.out.println("StreetFood: "+StreetFood);
		System.out.println("\n Snacks: ");
		System.out.println("Biscate: "+Snacks.getBiscates());
		System.out.println("Kurkure: "+Snacks.getKurkure());
		System.out.println("\n Chocolates: ");
		System.out.println("Dairymilk: "+Snacks.getChocolates().getDairymilk());
		System.out.println("FiveStar: "+Snacks.getChocolates().getFivestar());
		System.out.println("Munch: "+Snacks.getChocolates().getMunch());
		System.out.println("Perk: "+Snacks.getChocolates().getPerk());
	}
}
