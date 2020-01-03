package yaoyaolin.train.controller;

import com.sun.org.apache.xalan.internal.templates.Constants;
import org.neo4j.driver.v1.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yaoyaolin.train.entity.RestfulResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import static org.neo4j.driver.v1.Values.parameters;

@RestController
@RequestMapping(value = "neo4j")
public class RelationController {
    private Driver createDrive(){
        return GraphDatabase.driver("bolt://192.168.137.130:7474", AuthTokens.basic("neo4j","admin"));
    }

    @RequestMapping(value = "test")
    private void test(HttpServletRequest request, HttpServletResponse response){
        RestfulResult restfulResult = new RestfulResult();
        try{
            Driver driver = createDrive();
            Session session = driver.session();
            session.run("create (a:relation{star:{star})",parameters("star","邓玲"));
            session.close();
            driver.close();
        }catch (Exception e){
            restfulResult.setMessage(e.getMessage());
        }
    }
}
