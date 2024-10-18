package com.xworkz.collection.dto;

import java.io.Serializable;

import com.xworkz.collection.constants.Location;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class MallDTO implements Serializable,Comparable<MallDTO>{
	private int id;
	private String name;
	private Location location;
	private String owner;
	private double landDimension;
	
	@Override
	public int compareTo(MallDTO o) {
			return this.name.compareTo(o.name);
	}

}
