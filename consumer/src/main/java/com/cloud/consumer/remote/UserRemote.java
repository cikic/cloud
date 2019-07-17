package com.cloud.consumer.remote;

import com.cloud.consumer.remote.impl.UserRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "spring-cloud-producer",fallback = UserRemoteHystrix.class)
public interface UserRemote {
    @RequestMapping(value = "/getUser")
    public String getUser(@RequestParam("name") String name);
}
