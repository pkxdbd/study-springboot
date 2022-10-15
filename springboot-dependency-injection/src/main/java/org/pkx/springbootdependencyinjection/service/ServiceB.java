package org.pkx.springbootdependencyinjection.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceB {

    private final ServiceA serviceA;
}
