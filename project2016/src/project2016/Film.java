package project2016;

import java.util.ArrayList;

public class Film {
	private String name;
	private int length;
	public String[] times;
	public ArrayList<Ticket> tickets;
	public int availableTickets;
	public String[] Cinema;
	
	public Film(int length, String[] times, String name, int availableTickets) {
		super();
		setAvailableTickets(availableTickets);
		setName(name);
		setLength(length);
		setTimes(times);
		tickets = new ArrayList<Ticket>();
	}
	
	public void setAvailableTickets(int availableTickets) {
		this.availableTickets=availableTickets;
	}
	
	public int getAvailableTickets(){
		return availableTickets;
	}
	public void setName(String name){
		this.name= name;
	}
	
	public String getName(){
		return name;
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String[] getTimes() {
		return times;
	}

	public void setTimes(String[] times) {
		this.times = times;
	}

	public ArrayList<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(ArrayList<Ticket> tickets) {
		this.tickets = tickets;
	}

	public Ticket reserveTicket(Ticket ticket) throws Exception {
		if (ticket == null)
			throw new Exception("Ticket has no value!");
		tickets.add(ticket);
		availableTickets--;
		return ticket;
	}

	public Ticket[] reserveTickets(Ticket[] nOfTickets) throws Exception {
		if (nOfTickets == null)
			throw new Exception("No value!");
		ArrayList<Ticket> result = new ArrayList<Ticket>();
		for (Ticket ticket : tickets) {
			if (!tickets.contains(ticket)) {
				reserveTicket(ticket);
				result.add(ticket);
				availableTickets--;
			}
		}
	
		return (Ticket[]) result.toArray();
	}

}
