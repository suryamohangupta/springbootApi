package com.cars24.auction.controller;

import com.cars24.auction.dto.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuctionController {

    @RequestMapping(path = AppConstants.TEST_URI, method = RequestMethod.GET, headers = "Accept=application/json", produces = "application/json")
    public ApiResponse getUser() {
        return new ApiResponse(HttpStatus.MULTI_STATUS.value(), AppConstants.FAILED_MESSAGE,HttpStatus.MULTI_STATUS);
    }
}
