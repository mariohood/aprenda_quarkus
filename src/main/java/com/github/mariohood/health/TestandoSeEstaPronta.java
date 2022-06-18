package com.github.mariohood.health;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;
import org.eclipse.microprofile.health.Readiness;

@Readiness
@ApplicationScoped
public class TestandoSeEstaPronta implements HealthCheck{

    @Override
    public HealthCheckResponse call(){
        return HealthCheckResponse.named("Verificando se o banco esta populado").up().build();
    }
    
}
