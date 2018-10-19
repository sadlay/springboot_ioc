package com.lay.ioc.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lay.ioc.pojo.definiion.Person;
import com.lay.ioc.pojo.definiion.Shoes;
@Component
public class Programmer implements Person{
	@Autowired
	private Shoes runShoes=null;
	
	@Override
	public void activity() {
		this.runShoes.put();
	}

	@Override
	public void setShoes(Shoes shoes) {
		this.runShoes=shoes;
	}
}
