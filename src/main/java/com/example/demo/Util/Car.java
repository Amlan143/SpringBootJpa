package com.example.demo.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Car  {
	
	@Bean
	public Car instantiationCar() {
		Car c = new Car();
		return c;
	}
	
//	@Autowired // constructor // optional to write
//	public car(IEngine eng) {
//	this.eng =eng;
//	System.out.println("car engine  constructor");
//	}
//	
	
	
	
}
