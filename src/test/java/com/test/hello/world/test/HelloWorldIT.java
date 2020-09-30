package com.test.hello.world.test;

import static com.jayway.restassured.RestAssured.when;

import com.test.hello.world.HelloWorldApplication;
import io.dropwizard.Configuration;
import io.dropwizard.testing.ResourceHelpers;
import io.dropwizard.testing.junit5.DropwizardAppExtension;
import io.dropwizard.testing.junit5.DropwizardExtensionsSupport;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(DropwizardExtensionsSupport.class)
public class HelloWorldIT {

    private static DropwizardAppExtension<Configuration> SERVER = new DropwizardAppExtension<>(
            HelloWorldApplication.class,
            ResourceHelpers.resourceFilePath("test-config.yml")
    );

    @Test
    public void testSuccess() {
        when().get("/hello").then().statusCode(200);
    }

}
