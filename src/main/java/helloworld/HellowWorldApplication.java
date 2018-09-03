package helloworld;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HellowWorldApplication extends Application<HellowWorldConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HellowWorldApplication().run(args);
    }

    @Override
    public String getName() {
        return "HellowWorld";
    }

    @Override
    public void initialize(final Bootstrap<HellowWorldConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final HellowWorldConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
