package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController 
{
	@Autowired
    KafkaTemplate<String,String> template;
    String TOPIC_NAME = "pratik";

    @GetMapping("/produce/{msg}")
    public String postMessage(@PathVariable("msg") String msg)
    {
    	System.out.println(msg);
        template.send(TOPIC_NAME,msg);
        return "Message published successfully";
    }
}
