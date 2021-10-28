package com.github;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngineConfiguration;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.repository.Deployment;

public class ConfigMain {
    public static void main(String[] args) {
        ProcessEngine processEngine;
        ProcessEngineConfiguration engineConfiguration;

//        engineConfiguration = ProcessEngineConfiguration.createProcessEngineConfigurationFromResourceDefault();
//        engineConfiguration = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("camunda.cfg.xml");

//        processEngine = engineConfiguration.buildProcessEngine();
        processEngine = ProcessEngines.getDefaultProcessEngine();

        RepositoryService repositoryService = processEngine.getRepositoryService();
        Deployment deploy = repositoryService.createDeployment()
                .addClasspathResource("diagram_4.bpmn")
                .name("Process 4")
                .deployWithResult();
        processEngine.getRuntimeService().startProcessInstanceByKey("process_4");
    }
}
