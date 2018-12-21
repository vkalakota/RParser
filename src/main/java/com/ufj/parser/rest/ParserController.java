package com.ufj.parser.rest;

import com.ufj.parser.model.APIResponse;
import com.ufj.parser.model.entity.UFJResume;
import com.ufj.parser.model.rchilli.ResumeParseFields;
import com.ufj.parser.service.ParserService;
import com.ufj.parser.util.Environment;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ufj")
public class ParserController {

    private static final Logger logger = Logger.getLogger(ParserController.class.getName());

    @Autowired
    ParserService service;

    @Autowired
    Environment sysEnvironment;

    @RequestMapping(value = "/invoke", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public APIResponse execute() {
        logger.info(" in invoke controller");
        UFJResume resume = new UFJResume();
        //resume.setResumeId(1);
        //service.save(resume);
        return createResponse("Resume Parser API - Request has been accepted", "200", "Accepted");
    }

    @RequestMapping(value = "/parse/{resumeFileName}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public APIResponse parseSovrenResume(@PathVariable(value = "resumeFileName") String fileName) {

        StringBuffer parserResponse = service.parse(fileName);

        return createResponse(parserResponse.toString(), "200", "Accepted");
    }

    @RequestMapping(value = "/jaxparse/{resumeFileName}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public APIResponse jaxParseSovrenResume(@PathVariable(value = "resumeFileName") String fileName) {

        StringBuffer parserResponse = service.parse(fileName);

        return createResponse(parserResponse.toString(), "200", "Accepted");
    }

    private UFJResume map(ResumeParseFields objRcResume) {
        UFJResume ufjResume = new UFJResume();
        ufjResume.setResumeId(1);

        return ufjResume;
    }

    private APIResponse createResponse(String response, String status, String statusInfo) {
        APIResponse resp = new APIResponse();
        resp.setResponse(response);
        resp.setStatus(status);
        resp.setStatusInfo(statusInfo);

        return resp;
    }


}
