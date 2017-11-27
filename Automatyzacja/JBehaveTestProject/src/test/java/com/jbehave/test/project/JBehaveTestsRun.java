package com.jbehave.test.project;

import com.jbehave.test.project.Configuration.DefaultConfiguration;
import com.jbehave.test.project.Steps.*;
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

import static java.util.Arrays.asList;

@RunWith(JUnitReportingRunner.class)
public class JBehaveTestsRun extends JUnitStories {

    @Override
    public Configuration configuration() {
        DefaultConfiguration defaultConfiguration = new DefaultConfiguration();
        return defaultConfiguration.getConfiguration();
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new LoginSteps(), new ProjectSteps(), new TestCaseSteps(), new ExploratorySteps(), new DefectSteps());
    }

    @Override
    protected List<String> storyPaths() {
        return new StoryFinder().findPaths(CodeLocations.codeLocationFromClass(
                this.getClass()),
                asList("**/*.story"),
                asList(""));

    }

    public JBehaveTestsRun() {
        configuredEmbedder().embedderControls()
                .doGenerateViewAfterStories(true)
                .doIgnoreFailureInStories(false).doIgnoreFailureInView(true);

        configuredEmbedder().useMetaFilters(Arrays.asList("-skip"));
    }

}


