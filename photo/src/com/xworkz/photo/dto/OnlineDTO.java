package com.xworkz.photo.dto;

public class OnlineDTO {
 
	private String meetingCode;
	private String hostName;
	private int totalParticipants;
	
	
	
	public String getMeetingCode() {
		return meetingCode;
	}
	public void setMeetingCode(String meetingCode) {
		this.meetingCode = meetingCode;
	}
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public int getTotalParticipants() {
		return totalParticipants;
	}
	public void setTotalParticipants(int totalParticipants) {
		this.totalParticipants = totalParticipants;
	} 
	@Override
	public int hashCode() {
		System.out.println("running hash....");
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals method..");
		return false;
	}
	public OnlineDTO(String meetingCode, String hostName, int totalParticipants) {
		super();
		this.meetingCode = meetingCode;
		this.hostName = hostName;
		this.totalParticipants = totalParticipants;
	}
	
}
