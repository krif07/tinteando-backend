package co.com.cfd.tinteando.controller;

import co.com.cfd.tinteando.models.entity.Activity;
import co.com.cfd.tinteando.models.services.IActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ActivityRestController {

    @Autowired
    private IActivityService activityService;

    @GetMapping("/activities")
    public List<Activity> get(){
        return activityService.findAll();
    }
}
