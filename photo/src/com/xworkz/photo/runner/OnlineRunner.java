package com.xworkz.photo.runner;

import java.util.HashSet;
import java.util.Set;

import com.xworkz.photo.dto.OnlineDTO;

public class OnlineRunner {  

	public static void main(String[] args) {
OnlineDTO onlineDTO1 = new OnlineDTO("whz-pxrc-bbs","Om",22);
OnlineDTO onlineDTO2 = new OnlineDTO("whz-pxrc-bbs","Om",22);

Set<OnlineDTO> set = new HashSet<>();
set.add(onlineDTO1);
set.add(onlineDTO2);

System.out.println("Total Online set : " +  set.size());


	}

}
