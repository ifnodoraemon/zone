package com.ifnodoraemon.zone.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author ifnodoraemon
 */
@Component
public class MyAccessDecisionManager implements AccessDecisionManager {
    private final static Logger logger = LoggerFactory.getLogger(MyAccessDecisionManager.class);


    @Override
    public void decide(Authentication authentication, Object o, Collection<ConfigAttribute> configAttributes) throws AccessDeniedException, InsufficientAuthenticationException {
        if (null == configAttributes || 0 >= configAttributes.size()) {
            return;
        }else {
            String needRole;
            for (Iterator<ConfigAttribute> it = configAttributes.iterator(); it.hasNext();){
                needRole = it.next().getAttribute();

                for (GrantedAuthority ga : authentication.getAuthorities()){
                    if (needRole.trim().equals(ga.getAuthority().trim())){
                        return;
                    }
                }
            }

            throw new AccessDeniedException("当前用户没有访问权限");
        }
    }

    @Override
    public boolean supports(ConfigAttribute configAttribute) {
        return true;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
