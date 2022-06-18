package com.github.mariohood.health;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

@Liveness
@ApplicationScoped
public class TestandoSeEstaSaudavel2 implements HealthCheck{

    @Override
    public HealthCheckResponse call(){
        return HealthCheckResponse.named("Banco de dados 2").up().withData("Tempo de resposta em ms", 100).build();
    }
}
