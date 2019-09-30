package com.example.demo.service;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.springframework.stereotype.Service;

import com.example.demo.ws.obj.Quote;

@Service
public class QuoteService {

	private List<Quote> quotes = new ArrayList<Quote>();


	//	public Quote getQuote() {
	//		Random rn = new Random();
	//		int select=rn.nextInt(this.quotes.size());
	//		return this.quotes.get(select);
	//	}


	public List<Quote> getList(){
		return quotes;

	}
	public void addQuote(Quote quotes) {
		this.quotes.add(quotes);
	}

	public Quote getById(String id) {
		for(Quote tmp: quotes) {
			if(tmp.getId().equals(id)) {
				return tmp;
				}
		}
		return null;
	}
	
	public void deleteById(String id) {
		for(Quote tmp:quotes) {
			if(tmp.getId().equals(id)) {

				System.out.println(quotes.remove(Integer.parseInt(id)));
			}
		}
	}

}
