package com.ajin.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author ajin
 * @create 2022-10-31 15:16
 */
@Controller
//@RequestMapping("/hello")
public class RequestMappingController {

   @RequestMapping(
           value = {"/testRequestMapping","/test"},
           method = {RequestMethod.GET,RequestMethod.POST}
   )
    public String success(){
        return "success";
   }

   @GetMapping("/testGetMapping")
   public String testGetMapping(){
       return "success";
   }

    @PostMapping("/testPostMapping")
    public String testPostMapping(){
        return "success";
    }

    @RequestMapping(value = "/testPut",method = RequestMethod.PUT)
    public String testPut(){
       return "success";
    }


    @RequestMapping(
            value = {"/testParamsAndHeaders"},
            params = {"username","password!=123"},
            headers = {"Host=localhost:8080"}
    )
    public String testParamsAndHeaders(){
        return "success";
    }

//    @RequestMapping("/a?a/testAnt")
//    @RequestMapping("/a*a/testAnt")
    @RequestMapping("/**/testAnt")
    public String testAnt(){
       return "success";
    }

    @RequestMapping("/testPath/{id}/{name}")
    public String testPath(@PathVariable("id")Integer id,@PathVariable("name")String name){
        System.out.println("id:"+id+", name:"+name);
       return "success";
    }
}
