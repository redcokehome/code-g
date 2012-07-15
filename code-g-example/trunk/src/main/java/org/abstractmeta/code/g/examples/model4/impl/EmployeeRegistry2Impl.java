package org.abstractmeta.code.g.examples.model4.impl;

import java.util.Map;
import org.abstractmeta.code.g.examples.model4.Employee;
import org.abstractmeta.code.g.examples.model4.EmployeeRegistry2;
/**
 * This source code was automatically generated by code-g plugin.
 */

public class EmployeeRegistry2Impl implements EmployeeRegistry2 {
    private final Map<Integer, Employee> registry;

    public EmployeeRegistry2Impl(Map<Integer, Employee> registry) {
        this.registry = registry;
    }

    public void register(int argument0, Employee argument1) {
        registry.put(argument0, argument1);
    }

    public Employee get(int argument0) {
        return registry.get(argument0);
    }

    public Map<Integer, Employee> getRegistry() {
        return this.registry;
    }

}