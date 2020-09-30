package com.test.hello.world;

import com.test.hello.world.resource.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloWorldApplication extends Application<Configuration> {

    @Override
    public void initialize(Bootstrap<Configuration> b) {
    }

    @Override
    public void run(Configuration configuration, Environment environment) throws Exception {
        environment.jersey().register(HelloWorldResource.class);
    }

    public static void main(String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }
}
