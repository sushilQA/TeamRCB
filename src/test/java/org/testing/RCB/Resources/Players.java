package org.testing.RCB.Resources;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Players{
    public String name;
    @Override
	public String toString() {
		return "Players [name=" + name + ", country=" + country + ", role=" + role + ", priceInCrores=" + priceInCrores
				+ "]";
	}
	public String country;
    public String role;
    @JsonProperty("price-in-crores")
    public String priceInCrores;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPriceInCrores() {
		return priceInCrores;
	}
	public void setPriceInCrores(String priceInCrores) {
		this.priceInCrores = priceInCrores;
	}
    
    
}