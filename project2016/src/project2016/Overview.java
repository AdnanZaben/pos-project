package project2016;

import java.util.ArrayList;

public class Overview {
private ArrayList<Film> filme;

public Overview(ArrayList<Film> filme) {
	this.filme = filme;
}

public Film choseFilm(Film film){
	Film a = null;
	for(Film f: filme){
		if(f==film){
			a=f;
			break;	
		}	
	}
	return a;
	
	
}


}
