package com.demo;

import org.springframework.batch.item.ItemProcessor;

import com.demo.model.Carrier;


public class CustomItemProcessor implements ItemProcessor<Carrier, Carrier> {

	@Override
	public Carrier process(Carrier item) throws Exception {
		
		//System.out.println("Processing..." + item.getLegalname());
		return item;
	}

}