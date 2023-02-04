package com.basics.apis.controller;

import com.basics.apis.dto.ApiResponse;
import com.basics.apis.dto.AppConstants;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestApiController {

    @RequestMapping(path = AppConstants.TEST_URI, method = RequestMethod.GET, headers = "Accept=application/json", produces = "application/json")
    public ApiResponse getUser() {
        return new ApiResponse(HttpStatus.OK.value(), AppConstants.SUCCESS_MESSAGE,HttpStatus.OK);
    }
}
