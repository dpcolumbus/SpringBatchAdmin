package com.demo;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class ExitJobListener implements JobExecutionListener{

    @Override
    public void beforeJob(JobExecution jobExecution) {
        // no-op
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        // change exit message
        ExitStatus es = jobExecution.getExitStatus();
        jobExecution.setExitStatus(new ExitStatus(es.getExitCode(), "foo"));
    }
    
}