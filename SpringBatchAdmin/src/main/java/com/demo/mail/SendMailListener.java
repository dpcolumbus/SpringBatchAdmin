package com.demo.mail;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

public class SendMailListener implements StepExecutionListener  {

	@Override
	public ExitStatus afterStep(StepExecution arg0) {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public void beforeStep(StepExecution arg0) {
		// TODO Auto-generated method stub
		System.out.println("sending email");
	}

	/*@Override
	public void afterJob(JobExecution arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("sending email");
		
	}

	@Override
	public void beforeJob(JobExecution arg0) {
		// TODO Auto-generated method stub
		System.out.println("checking  email configuration");
		
	}*/
	
	
}


