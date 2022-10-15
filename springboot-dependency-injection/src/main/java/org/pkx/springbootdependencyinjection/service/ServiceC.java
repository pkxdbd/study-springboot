package org.pkx.springbootdependencyinjection.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceC {

    private final ServiceB serviceB;

}
