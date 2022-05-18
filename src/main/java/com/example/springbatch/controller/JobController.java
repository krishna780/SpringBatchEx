package com.example.springbatch.controller;

import com.example.springbatch.runner.JobRunner;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/run")
@AllArgsConstructor
public class JobController {
    private JobRunner jobRunner;
    @RequestMapping(value = "/job")
    @PutMapping(value = "/put/{id}", com)
    public String runJob() {
        jobRunner.runBatchJob();
        return String.format("Job Demo1 submitted successfully.");
    }
}
