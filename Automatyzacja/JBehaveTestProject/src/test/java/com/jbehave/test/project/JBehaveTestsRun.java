package com.jbehave.test.project;

import com.jbehave.test.project.Configuration.DefaultConfiguration;
import com.jbehave.test.project.Steps.LoginSteps;
import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

@RunWith(JUnitReportingRunner.class)
public class JBehaveTestsRun extends JUnitStories {

    @Override
    public Configuration configuration() {
        DefaultConfiguration defaultConfiguration = new DefaultConfiguration();
        return defaultConfiguration.getConfiguration();
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new LoginSteps());
    }

    @Override
    protected List<String> storyPaths() {
        return new StoryFinder().findPaths(CodeLocations.codeLocationFromClass(
                this.getClass()),
                Arrays.asList("**/*.story"),
                Arrays.asList(""));
    }
}
