package org.testing.RCB.Resources;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RCB{
    public String name;
    public String location;
    public ArrayList<Players> player;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public ArrayList<Players> getPlayer() {
		return player;
	}
	public void setPlayer(ArrayList<Players> player) {
		this.player = player;
	}
    
}