package com.github;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.RepositoryService;

public class ConfigMain {
    public static void main(String[] args) {
        ProcessEngine processEngine;

        processEngine = ProcessEngines.getDefaultProcessEngine();

        RepositoryService repositoryService = processEngine.getRepositoryService();
        repositoryService.createDeployment()
                .addClasspathResource("diagram_4.bpmn")
                .name("Process 4")
                .deployWithResult();
        processEngine.getRuntimeService().startProcessInstanceByKey("process_4");
    }
}
