package project2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	private Overview o;

	public Test() {
		Film ch = null;
		Scanner sc = new Scanner(System.in);
		int end = 0;
		ArrayList<Film> arr = new ArrayList<Film>();
		String[] times;
		times = new String[] { "17:38", "19:42", "20:30", "22:00", "23:15" };
		Film a = new Film(120, times, "Jems band", 3);
		arr.add(a);
		Film b = new Film(150, times, "Jems band 2", 2);
		arr.add(b);
		Film c = new Film(160, times, "Jems band 3", 5);
		arr.add(c);
		Film d = new Film(130, times, "Jems band 4", 0);
		arr.add(d);
		o = new Overview(arr);
		System.out.println("Select a movie");
		System.out.println("------------------");
		System.out.println();
		System.out.println("1....Jems Band");
		System.out.println();
		System.out.println("2....Jems Band 2");
		System.out.println();
		System.out.println("3....Jems Band 3");
		System.out.println();
		System.out.println("4....Jems Band 4");
		System.out.println();
		String read = sc.next();
		if (read.charAt(0) >= '1' && read.charAt(0) <= '4') {
			end = Integer.parseInt(read);
		} else {
			System.out.println("Movie not found");
		}
		switch (end) {
		case 1:
			ch = o.choseFilm(a);
			if(ch.getAvailableTickets()==0){
				System.out.println("Sorry, tickets are sold out for this movie");
			}
			else{
				System.out.println("You chose " + o.choseFilm(d).getName()+"\n");
				Ticket t = new Ticket()
				System.out.println("------------------");
				System.out.println("Available times: "+"\n");
				int n=1;
				for(String i: ch.getTimes()){
					System.out.println(n+"...."+i);
					n++;
				}
				System.out.println();
				System.out.println("Select a time");
				System.out.println();
				String r = sc.next();
				if (r.charAt(0) >= '1' && r.charAt(0) <= '4') {
					end = Integer.parseInt(r);
				}
				switch(end){
				case 1: 
					
				}
			}
			
			break;
		case 2:
			ch = o.choseFilm(b);
			if(ch.getAvailableTickets()==0){
				System.out.println("Sorry, tickets are sold out for this movie");
			}
			else{
				System.out.println("You chose " + o.choseFilm(d).getName());
			}
		case 3:
			ch = o.choseFilm(c);
			if(ch.getAvailableTickets()==0){
				System.out.println("Sorry, tickets are sold out for this movie");
			}
			else{
				System.out.println("You chose " + o.choseFilm(d).getName());
			}
			break;
		case 4:
			ch = o.choseFilm(d);
			if(ch.getAvailableTickets()==0){
				System.out.println("Sorry, tickets are sold out for this movie");
			}
			else{
				System.out.println("You chose " + o.choseFilm(d).getName());
			}
			break;
		}
		
//		Ticket t= new ticket(2130, 3, senior, );
		
	}

	public static void main(String[] args) {
		Test t = new Test();

	}

}
