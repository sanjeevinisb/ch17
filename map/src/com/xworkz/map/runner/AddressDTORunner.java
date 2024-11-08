package com.xworkz.map.runner;

import java.util.Collection; 
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.xworkz.map.dto.AddressDTO;
import com.xworkz.map.dto.Code;
import com.xworkz.map.dto.CountryDTO;

public class AddressDTORunner {

	public static void main(String[] args) {

		Map<String, AddressDTO> map = new HashMap<>();
		map.put("Sanjeevini", new AddressDTO(90785434517L, "KalyanNagar", "Bangalore", "Karnataka",new CountryDTO("India", Code.INDIA)));
		map.put("Krishav",new AddressDTO(98236860655L, "Bharati", "kochi", " kerala", new CountryDTO("India", Code.INDIA)));
		map.put("Nikhita",new AddressDTO(9989267789L, "Aarati", "pune", "Karnataka", new CountryDTO("India", Code.INDIA)));
		map.put("Sneha",new AddressDTO(98776434567L, "Poorna", "Kolar", "Karnataka", new CountryDTO("India", Code.INDIA)));
		map.put("Ashwini",new AddressDTO(98877645678L, "Rajajinagar", "manglore", "Karnataka", new CountryDTO("India", Code.INDIA)));
		
		Set<String> keys = map.keySet();
		keys.forEach(System.out::println);
		System.out.println("-------------------------------------");
		Collection<AddressDTO> values = map.values();
		values.forEach(System.out::println);
		System.out.println("-------------------------------------");
		Set<Map.Entry<String, AddressDTO>> entries = map.entrySet();
		entries.forEach((ref) -> System.out.println(ref));

	}

}