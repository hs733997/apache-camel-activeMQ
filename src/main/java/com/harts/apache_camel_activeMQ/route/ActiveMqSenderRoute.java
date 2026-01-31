package com.harts.apache_camel_activeMQ.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqSenderRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:activeMq-timer-route?period=10000")
                .transform().constant("ActiveMq Route")
                .to("activemq:my-activeMq-queue");
    }
}
