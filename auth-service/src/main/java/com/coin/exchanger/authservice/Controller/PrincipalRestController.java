package com.coin.exchanger.authservice.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created By Semih Beceren at 08-Dec-17
 */
@RestController
public class PrincipalRestController {

    @RequestMapping("/user")
    Principal principal(Principal principal) {
        return principal;
    }
}
