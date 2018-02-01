package com.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.demo.model.Carrier;


public class ReportFieldSetMapper implements FieldSetMapper<Carrier> {

	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	@Override
	public Carrier mapFieldSet(FieldSet fieldSet) throws BindException {
		
		Carrier carrier = new Carrier();
		carrier.setDocket(fieldSet.readString(0));
		carrier.setUsdot(fieldSet.readString(1));
		carrier.setLegalname(fieldSet.readString(2));
		carrier.setDbaname(fieldSet.readString(3));
		carrier.setAddress(fieldSet.readString(4));
		carrier.setCity(fieldSet.readString(5));
		carrier.setState(fieldSet.readString(6));
		carrier.setZip(fieldSet.readString(7));
		//carrier.setUsdot(fieldSet.readString(8));
		//carrier.setUsdot(fieldSet.readString(9));
		//carrier.setUsdot(fieldSet.readString(1));
		//.setUsdot(fieldSet.readString(1));
		
		
		//report.setQty(fieldSet.readInt(2));
		//report.setStaffName(fieldSet.readString(3));
		
		//default format yyyy-MM-dd
		//fieldSet.readDate(4);
		//String date = fieldSet.readString(4);
	
		
		return carrier;
		
	}

}