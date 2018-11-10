package com.ufj.parser.rest;

import com.ufj.parser.model.APIResponse;
import com.ufj.parser.model.entity.UFJResume;
import com.ufj.parser.service.Service;
import com.ufj.parser.util.Environment;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ufj")
public class Controller {

    private static final Logger logger = Logger.getLogger(Controller.class.getName());

    @Autowired
    Service service;

//    @Autowired
//    Environment sysEnvironment;

    @RequestMapping(value = "/invoke", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public APIResponse execute() {
        System.out.println(" in controller");
        UFJResume resume = new UFJResume();
        resume.setResumeId(1);

        service.save(resume);
        return createResponse("Hello", "200", "Accepted");
        //createResponse("Your request has been accepted", Constants.STATUS_ACCEPTED, Constants.STATUS_ACCEPTED_INFO);

    }

    private APIResponse createResponse(String response, String status, String statusInfo) {
        APIResponse resp = new APIResponse();
        resp.setResponse(response);
        resp.setStatus(status);
        resp.setStatusInfo(statusInfo);

        return resp;
    }




}
