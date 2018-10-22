package com.ufj.parser.rest;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.List;


@RestController
@RequestMapping("/edm-api/v1/")
public class Controller {

    private static final Logger logger = Logger.getLogger(Controller.class.getName());

    @Autowired
    OfficeProfileService officeService;

    @Autowired
    OfficeProfileEnvironment sysEnvironment;

    @RequestMapping(value = "/invoke", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public APIResponse getChannels() {

        return createResponse("Your request has been accepted", Constants.STATUS_ACCEPTED, Constants.STATUS_ACCEPTED_INFO);

    }

    @RequestMapping(value = "offices/{officeId}/to/{email}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public APIResponse fetchOfficeProfile(@PathVariable(value = "officeId") String officeId, @PathVariable(value = "email") String email) {
        logger.info(" input param - officeId :: " + officeId);
        logger.info(" input param - email :: " + email);
        String validOutput = sysEnvironment.getPropertyValue(Constants.ASYNC_RESPONSE) + " " + officeId;
        String inValidOutput = sysEnvironment.getPropertyValue(Constants.ASYNC_INVALID_RESPONSE) + " " + email;

        boolean isValidRequest = officeService.isValidEmail(email);
        try {
            if (isValidRequest) {
                logger.info("calling office service");
                DeferredResult<Office> result = new DeferredResult<>();
                officeService.processOfficeProfile((office) -> result.setResult(office), officeId, email);
            }
        } catch (Exception e) {
            logger.error("Exception in fetchOfficeProfile() ", e);
        }
        if (isValidRequest) {
            return createResponse(validOutput, Constants.STATUS_ACCEPTED, Constants.STATUS_ACCEPTED_INFO);
        } else {
            return createResponse(inValidOutput, Constants.STATUS_BADREQUEST, Constants.STATUS_BADREQUEST_INFO);
        }
    }

    private APIResponse createResponse(String response, String status, String statusInfo) {
        APIResponse resp = new APIResponse();
        resp.setResponse(response);
        resp.setStatus(status);
        resp.setStatusInfo(statusInfo);

        return resp;
    }

}
