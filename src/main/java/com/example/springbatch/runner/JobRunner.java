package com.example.springbatch.runner;

import com.example.springbatch.constants.Constants;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Log4j2
@AllArgsConstructor
public class JobRunner {
    private JobLauncher simpleJobLauncher;
    private Job demo1;

    public void runBatchJob(){
        JobParametersBuilder jobParametersBuilder=new JobParametersBuilder();
        jobParametersBuilder.addString(Constants.FILE_NAME_CONTEXT_KEY,"employees.csv");
        jobParametersBuilder.addDate("date", new Date(), true);
        runJob(demo1,jobParametersBuilder.toJobParameters());
    }

    private void runJob(Job job, JobParameters toJobParameters) {
        try {
            JobExecution jobExecution = simpleJobLauncher.run(job, toJobParameters);
        } catch (JobExecutionAlreadyRunningException e) {
              log.info(toJobParameters.getParameters());

        } catch (JobRestartException e) {
            log.info("JobRestartException",toJobParameters.getParameters());
        } catch (JobInstanceAlreadyCompleteException e) {
            log.info("JobInstanceAlreadyCompleteException",toJobParameters.getParameters());
        } catch (JobParametersInvalidException e) {
            log.info("JobParametersInvalidException",toJobParameters.getParameters());
        }

    }

}
