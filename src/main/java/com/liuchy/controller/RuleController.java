package com.liuchy.controller;

import com.liuchy.domain.Person;
import com.liuchy.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuchy on 2018/1/16.
 */
@RestController
@RequestMapping("/rules")
public class RuleController {
    @Autowired
    private RuleService ruleService;

    @RequestMapping(value = "/verify", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String ruleVerify(@RequestBody Person person) {
        ruleService.getKieSession(person);
        return "11111";
    }
}
