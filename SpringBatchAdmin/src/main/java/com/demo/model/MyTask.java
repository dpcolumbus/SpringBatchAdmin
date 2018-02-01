package com.demo.model;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

class MyTask implements Tasklet {
	  @Override
	  public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		  RepeatStatus repeatStatus=null;
		  System.out.println("my task called");
		  //existng batch logic 
		/* try {
		  int a=4/0;
		 }catch(Exception e)	{
			 e.getMessage();
		 }*/
		  return RepeatStatus.FINISHED; 
		//  return repeatStatus;
	  }
	}