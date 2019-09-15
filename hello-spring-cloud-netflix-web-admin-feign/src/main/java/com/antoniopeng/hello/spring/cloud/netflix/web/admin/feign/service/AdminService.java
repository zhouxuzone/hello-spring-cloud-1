package com.antoniopeng.hello.spring.cloud.netflix.web.admin.feign.service;

import com.antoniopeng.hello.spring.cloud.netflix.web.admin.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "hello-spring-cloud-netflix-service-admin", fallback = AdminServiceHystrix.class)
public interface AdminService {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    String sayHi(@RequestParam("message") String message);

}