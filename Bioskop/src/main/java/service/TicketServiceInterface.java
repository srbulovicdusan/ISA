package service;

import java.util.Collection;

import domain.Ticket;

public interface TicketServiceInterface {
	Collection<Ticket> getTickets();
	Ticket addTicket(Ticket ticket);
	void deleteTicket(Ticket ticket);
	Ticket getTicket(Long id);
}
