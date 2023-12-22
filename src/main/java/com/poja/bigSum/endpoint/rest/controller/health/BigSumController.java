package com.poja.bigSum.endpoint.rest.controller.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class BigSumController {
    @GetMapping("/big-sum")
    public String bigSum(@RequestParam String a, @RequestParam String b) {
        try {
            BigInteger bigA = new BigInteger(a);
            BigInteger bigB = new BigInteger(b);

            BigInteger result = bigA.add(bigB);

            return result.toString();
        } catch (NumberFormatException e) {
            return "Invalid number format. Please provide valid integer values for 'a' and 'b'.";
        } catch (Exception e) {
            return "An error occurred while processing the request.";
        }
    }
}
