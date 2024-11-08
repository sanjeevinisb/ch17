package com.xworkz.collection.runner;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.stream.Collectors;

import com.xworkz.collection.hrdto.HRDto;

public class HRDtoRunner {

	public static void main(String[] args) {
		HRDto HRDto1 = new HRDto("Ashwini", "B.E", 8, "Kalyannagar");
		HRDto HRDto2 = new HRDto("Nikhita", "BA", 4, "Jayanagar");
		HRDto HRDto3 = new HRDto("Sneha", "M.com", 7, "Hulimav");
		HRDto HRDto4 = new HRDto("Sindhu", "B.Sc", 5, "Rajajnagar");
		HRDto HRDto5 = new HRDto("Bharati", "M.com", 6, "Basveshwarnagar");
		HRDto HRDto6 = new HRDto("Aarati", "B.com", 9, "Kamalanagar");
		HRDto HRDto7 = new HRDto("Tanaya", "M.sc", 2, "Sumannagar");
		HRDto HRDto8 = new HRDto("Ananya", "B.E", 1, "Nagasandra");
		HRDto HRDto9 = new HRDto("Poorna", "MA", 10, "Indiranagar");
		HRDto HRDto10 = new HRDto("Kavya", "M.com", 3, "Mahalakshmi Layout");

		Collection<HRDto> collection = new LinkedList<HRDto>();
		collection.add(HRDto1);
		collection.add(HRDto2);
		collection.add(HRDto3);
		collection.add(HRDto4);
		collection.add(HRDto5);
		collection.add(HRDto6);
		collection.add(HRDto7);
		collection.add(HRDto8);
		collection.add(HRDto9);
		collection.add(HRDto10);

		collection.forEach((ref) -> System.out.println(ref));
		// 1.find all hr from a location
		System.out.println("***************");

		collection.stream().map((ref) -> ref.getLocation()).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));
		System.out.println("***************");

		// 2.find all hr totalExp greater than 5
		collection.stream().filter(dto -> dto.getTotalExp() > 5)
				.sorted((dto1, dto2) -> Double.compare(dto2.getTotalExp(), dto1.getTotalExp()))
				.forEach(dto -> System.out.println(dto));
		System.out.println("***************");

		// 3.find all hr name ending with r case in-sensitive
		collection.stream().filter((ref) -> ref.getName().startsWith("a")).forEach((ref) -> System.out.println(ref));
		System.out.println("***************");

		// 4.get only locations
		collection.stream().map((ref) -> ref.getLocation()).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));
		System.out.println("***************");

		// 5. get only name
		collection.stream().map((ref) -> ref.getName()).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));

		System.out.println("***************");

		// 6.sort hr by name and qualification
		Collection<String> name = collection.stream().map(HRDto::getName).sorted().collect(Collectors.toList());
		System.out.println("name in ascending order:" + name);
		Collection<String> qualification = collection.stream().map(HRDto::getQualification).sorted()
				.collect(Collectors.toList());
		System.out.println("qualification in ascending order:" + qualification);
		System.out.println("***************");

		
		// 7.sort hr totalExp in desc
		collection.stream().sorted((ref1, ref2) -> Integer.compare(ref2.getTotalExp(), ref1.getTotalExp()))
				.collect(Collectors.toList()).forEach(ref -> System.out.println(ref));
		System.out.println("***************");

		// 8.ListIterator to traverse in backward direction
		ListIterator<HRDto> listIterator = ((LinkedList<HRDto>) collection).listIterator(collection.size());
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());

		}

	}
}
