package com.xworkz.ticket.dto;



import lombok.AllArgsConstructor; 
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class TicketDto {
    private String name;
    private int ticket;
    private long contact;
    private String email;
}

