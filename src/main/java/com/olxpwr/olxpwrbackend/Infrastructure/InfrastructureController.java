package com.olxpwr.olxpwrbackend.Infrastructure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfrastructureController
{
    @GetMapping("/ping")
    public String GetPingResponse()
    {
        return "pong";
    }
}
