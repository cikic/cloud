package com.cloud.consumer.remote.impl;

import com.cloud.consumer.remote.UserRemote;
import org.springframework.stereotype.Component;

@Component
public class UserRemoteHystrix  implements UserRemote {
    @Override
    public String getUser(String name) {
        return "hi " +name+", this messge send failed ";
    }
}
