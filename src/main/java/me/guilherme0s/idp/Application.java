package me.guilherme0s.idp;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.micronaut.runtime.Micronaut;
import org.slf4j.bridge.SLF4JBridgeHandler;

@OpenAPIDefinition(info = @Info(title = "IDP", version = "v1.0"))
public class Application {

    static void main(String[] args) {
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
        Micronaut.run(Application.class, args);
    }
}
