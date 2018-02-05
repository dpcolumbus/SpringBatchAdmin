package com.demo;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException {

		
		
		String[] springConfig  = 
			{	
					"META-INF/spring/batch/jobs/job-config.xml" 
			};
		
		JobParameters jobParameters =
	  			  new JobParametersBuilder()
	  			  .addLong("time",System.currentTimeMillis()).toJobParameters();
	  	
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(springConfig);
		
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		
    	Job job1 = (Job) context.getBean("helloWorldJob");
    	Job job2 = (Job) context.getBean("CustomJob");


    	
    	
    	JobExecution jobExecution = jobLauncher.run(job1, jobParameters);
        //JobExecution jobExecution = jobLauncherTestUtils.launchStep("step1");
        System.out.println("*************************JOB Summary*****************************************");
        System.out.println("Job Name : " + jobExecution.getJobInstance().getJobName());
		System.out.println("Job Status : " + jobExecution.getStatus());
		System.out.println("Job Start Time : " + jobExecution.getStartTime());
		System.out.println("Job End Time : " + jobExecution.getEndTime());
		System.out.println("Job getStepExecutions : " + jobExecution.getStepExecutions().toString());
		//System.out.println("jobExecution:::"+jobExecution.getExitStatus().getExitDescription());
	    System.out.println("*************************End JOB Summary*****************************************");
      
        
      //jobLauncher.run("CustomJob")
      /*  jobExecution = jobLauncher.run(job2, jobParameters);
        //JobExecution jobExecution = jobLauncherTestUtils.launchStep("step1");
        System.out.println("*************************JOB Summary*****************************************");
        System.out.println("Job Name : " + jobExecution.getJobInstance().getJobName());
		System.out.println("Job Status : " + jobExecution.getStatus());
		System.out.println("Job Start Time : " + jobExecution.getStartTime());
		System.out.println("Job End Time : " + jobExecution.getEndTime());
		System.out.println("Job getStepExecutions : " + jobExecution.getStepExecutions().toString());
		System.out.println("Job getFailureExceptions : " + jobExecution.getFailureExceptions());
	    System.out.println("*************************End JOB Summary*****************************************");*/
      

	}
	
	
}
