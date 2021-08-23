package com.example.springbatch.config;

import lombok.AllArgsConstructor;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@AllArgsConstructor
@EnableAsync
public class BaseConfig {
    public JobRepository jobRepository;

    public JobLauncher simpleJobLauncher(){
        SimpleJobLauncher  simpleJobLauncher= new SimpleJobLauncher();
        simpleJobLauncher.setJobRepository(jobRepository);
        return simpleJobLauncher;
    }
}
