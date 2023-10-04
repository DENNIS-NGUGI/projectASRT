package com.projectkra.main.Controller;

import com.projectkra.main.Model.Work_Order;
import com.projectkra.main.Service.DataService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DataController {
    /*@Autowired*/
    private final DataService dataService;


    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/reports")
    public List<Work_Order> fetchAll() {
        return dataService.fetchAll();
    }
    @GetMapping("/count-choices/open")
    public Long countOpenChoices() {
        return dataService.countOpenChoices();
    }

    @GetMapping("/count-choices/closed")
    public Long countClosedChoices() {
        return dataService.countClosedChoices();
    }

    @GetMapping("/count-choices/pending")
    public Long countPendingChoices() {
        return dataService.countPendingChoices();
    }

    @GetMapping("/count-choices/new")
    public Long countNewChoices() {
        return dataService.countNewChoices();
    }



}
