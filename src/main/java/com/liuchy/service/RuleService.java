package com.liuchy.service;

import com.liuchy.domain.Person;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liuchy on 2018/1/16.
 */
@Service
public class RuleService {
    @Autowired
    private KieContainer kieContainer;

    public void getKieSession(String appId) {
        KieSession kieSession = kieContainer.newKieSession("rulesSession");
        //kieSession.insert(person);query domain
        kieSession.fireAllRules();
        kieSession.dispose();
    }
}
