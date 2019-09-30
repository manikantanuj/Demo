package com.example.demo.ws.endpoints.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.QuoteService;
import com.example.demo.ws.obj.Quote;

@RestController
public class DemoEndPoint {

	@Autowired
	private QuoteService quoteService;

	
	
//	@RequestMapping("/")
//	public Quote getQuote() {
//		return this.quoteService.getQuote();
//	}
//	
	

	@RequestMapping("/getList")
	public List<Quote> viewList() {
		return this.quoteService.getList();
	}
	@RequestMapping(value="/quote",method=RequestMethod.POST)
	public void addQuote(@RequestBody Quote quotes) {
		this.quoteService.addQuote(quotes);
	}
	
	@RequestMapping(value="getById",method=RequestMethod.PUT)
	public Quote getById(@RequestParam String id) {
		
		return(this.quoteService.getById(id));
		
		
	}
	@RequestMapping(value="/deleteById",method=RequestMethod.DELETE)
	public void deleteById(String id) {
		this.quoteService.deleteById(id);
	}
	
	
	
}
