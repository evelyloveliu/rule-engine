package com.liuchy.controller;

import com.liuchy.domain.Person;
import com.liuchy.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by liuchy on 2018/1/16.
 */
@RestController
@RequestMapping("/rules")
public class RuleController {
    @Autowired
    private RuleService ruleService;

    @RequestMapping(value = "/preCheck", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String ruleVerify(@RequestParam String appId) {
        ruleService.getKieSession(appId);
        return "11111";
    }
}
