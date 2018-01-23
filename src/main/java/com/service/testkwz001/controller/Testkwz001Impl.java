package com.service.testkwz001.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-01-23T07:05:20.485Z")

@RestSchema(schemaId = "testkwz001")
@RequestMapping(path = "/testkwz001", produces = MediaType.APPLICATION_JSON)
public class Testkwz001Impl {

    @Autowired
    private Testkwz001Delegate userTestkwz001Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTestkwz001Delegate.helloworld(name);
    }

}
