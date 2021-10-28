package com.github;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class Print implements JavaDelegate
{
    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("DELEGATE CLASS");
    }
}
