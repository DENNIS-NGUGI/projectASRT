package com.projectkra.main.com.projectkra.main.Controller;

import com.projectkra.main.com.projectkra.main.Model.Work_Order;
import com.projectkra.main.com.projectkra.main.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

   private final Service service1;

    public Controller(Service service1) {
        this.service1 = service1;
    }

    @GetMapping("/requests")
    public List<Work_Order> getAllRequests(){
        return service1.getAllRequests();
    }
    @GetMapping("/requests/{work_order_number}")
    public Work_Order getRequestsByStaffNumber(@PathVariable String work_order_number){
       return service1.getRequestsByStaffNumber(work_order_number);
    }
    @PostMapping("/requests")
    public void createRequests(@RequestBody Work_Order workOrder) {
        service1.createRequests(workOrder);
    }

    @PutMapping("/requests/{work_order_number}")
    public void updateRequests(@PathVariable String work_order_number, @RequestBody Work_Order workOrder) {
        service1.updateRequests(work_order_number, workOrder);
    }

    @DeleteMapping("/requests/{work_order_number}")
    public void deleteRequests(@PathVariable String work_order_number) {
        service1.deleteRequests(work_order_number);
    }


}
