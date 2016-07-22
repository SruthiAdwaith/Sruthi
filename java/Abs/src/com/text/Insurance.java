package com.text;

abstract class Insurance {
	public int int_innum;
	public int int_totemi;
	public int int_insamt;
	
	public abstract void registerinsurance();
	public abstract int payemi();
	
	public abstract int claiminsurance();
}
