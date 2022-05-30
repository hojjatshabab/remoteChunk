package com.master.remote.chunking;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class MasterRemoteChunkingApplication {

    public static void main(String[] args) {
        SpringApplication.run(MasterRemoteChunkingApplication.class, args);
    }

}
