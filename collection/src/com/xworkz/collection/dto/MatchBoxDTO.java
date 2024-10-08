package com.xworkz.collection.dto;

import java.io.Serializable;
import com.xworkz.collection.constants.MatchBoxMaterial;

public class MatchBoxDTO implements Serializable{
	private double cost;
	private String brand;
	private MatchBoxMaterial material;
	public MatchBoxDTO() {
	}
	
	public MatchBoxDTO(double cost, String brand, MatchBoxMaterial material) {
		super();
		this.cost = cost;
		this.brand = brand;
		this.material = material;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MatchBoxDTO other = (MatchBoxDTO) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (material != other.material)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MatchBoxDTO [cost=" + cost + ", brand=" + brand + ", material=" + material + "]";
	}
}