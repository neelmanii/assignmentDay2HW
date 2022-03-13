package com.two.tv.assignment;

public class SonyTv implements TvRemote {

	public void changeChannel() {
		System.out.println(getTvName()+"Channel changed");
	}

	public void changeVolume() {
		System.out.println(getTvName()+"Volume changed");		
	}

	public void switchOn() {
		System.out.println(getTvName()+"Tv turned on");
	}

	public void switchOff() {
		System.out.println(getTvName()+"Tv turned off");		
	}
	
	public String getTvName() {
		return "Sony Tv";
	}

}
