package com.liuchy.controller;

import com.liuchy.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.liuchy.service.RuleService;

/**
 * Created by liuchy on 2018/1/16.
 */
@RestController
@RequestMapping("/rules")
public class RuleController {
    @Autowired
    private RuleService ruleService;

    @RequestMapping(value = "/verify", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String ruleVerify(@RequestParam(value = "data") Person person) {
        ruleService.getKieSession(person);
        return "11111";
    }
}
