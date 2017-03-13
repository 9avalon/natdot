package com.avalon.navdot.web.controller;

/**
 * @version 1.0
 * @author: 侯铭健
 * @email mingjian_hou@kingdee.com
 * @time 2017/3/13
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
