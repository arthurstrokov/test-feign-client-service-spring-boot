package com.gmail.arthurstrokov.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleClientController {

    @GetMapping("/data/{dataId}")
    public SimpleClientData getData(@PathVariable("dataId") int dataId) {
        System.out.println("dataId " + dataId);
        return new SimpleClientData(dataId, "name-" + dataId, dataId * 2);
    }
}
