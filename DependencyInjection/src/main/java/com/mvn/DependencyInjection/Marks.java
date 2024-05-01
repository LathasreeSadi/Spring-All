package com.mvn.DependencyInjection;

public class Marks {
	private int Maths;
	private int Physics;
	private int Chemistry;
	public Marks() {
		
	}
	public Marks(int maths, int physics, int chemistry) {
		this.Maths=maths;
		this.Physics=physics;
		this.Chemistry=chemistry;
	}
	public void setMaths(int maths) {
		this.Maths=maths;
	}
	public int getMaths() {
		return this.Maths=Maths;
	}
	public void setPhysics(int physics) {
		this.Physics=physics;
	}
	public int getPhysics() {
		return this.Physics=Physics;
	}
	public void setChemistry(int chemistry) {
		this.Chemistry=chemistry;
	}
	public int getChemistry() {
		return this.Chemistry=Chemistry;
	}
}
