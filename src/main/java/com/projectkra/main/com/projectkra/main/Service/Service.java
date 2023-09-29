package com.projectkra.main.com.projectkra.main.Service;

import com.projectkra.main.com.projectkra.main.Model.Work_Order;
import com.projectkra.main.com.projectkra.main.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {
    private final Repository repository1;

     public Service(Repository repository1) {
         this.repository1 = repository1;
     }
    public List<Work_Order> getAllRequests(){
        return repository1.findAll();
    }

    public Work_Order getRequestsByStaffNumber(String work_order_number){
        // Get the employee request from the Optional object.
        Optional<Work_Order> workOrder = Optional.ofNullable(repository1.findById(work_order_number));

        // If the employee request is present, return it. Otherwise, return null.
        return workOrder.orElse(null);

    }
    public void createRequests(Work_Order request) {
        repository1.saveWorkOrder(request);
    }

    public void updateRequests(String staffNumber, Work_Order workOrder) {

        // Get the  request that is being updated.

        //Optional<Requests> existingRequests = Optional.ofNullable(repository1.findById(staffNumber));
        Optional<Work_Order> existingRequests = Optional.of(new Work_Order());
        Work_Order existingWorkOrderValue = existingRequests.get();

        // Get the employee request that is being updated.
       // Requests existingRequests = repository1.findById(staffNumber).orElse(null);

        // If the employee request exists, update it with the new values.
        existingWorkOrderValue.setWork_order_number(workOrder.getWork_order_number());
        existingWorkOrderValue.setCategory_id(workOrder.getCategory_id());
        existingWorkOrderValue.setCls_id(workOrder.getCls_id());
        existingWorkOrderValue.setDate_closed(workOrder.getDate_closed());
        existingWorkOrderValue.setDel(workOrder.getDel());
        existingWorkOrderValue.setDate_completed(workOrder.getDate_completed());
        existingWorkOrderValue.setDate_due(workOrder.getDate_due());
        existingWorkOrderValue.setDate_lodged(workOrder.getDate_lodged());
        existingWorkOrderValue.setDepartment_id(workOrder.getDepartment_id());
        existingWorkOrderValue.setFinancial_year(workOrder.getFinancial_year());
        existingWorkOrderValue.setFinancial_quarter(workOrder.getFinancial_quarter());
        existingWorkOrderValue.setWork_status(workOrder.getWork_status());
        existingWorkOrderValue.setInternal_priority(workOrder.getInternal_priority());
        existingWorkOrderValue.setSystem_name(workOrder.getSystem_name());
        existingWorkOrderValue.setStaff_id(workOrder.getStaff_id());
        existingWorkOrderValue.setSta_id(workOrder.getSta_id());
        existingWorkOrderValue.setSeverity_id(workOrder.getSeverity_id());
        existingWorkOrderValue.setSource(workOrder.getSource());
        existingWorkOrderValue.setWork_order_owner(workOrder.getWork_order_owner());
        // Save the updated request to the database.
        repository1.saveWorkOrder(workOrder);
    }

    public void deleteRequests(String work_order_number) {
        repository1.deleteById(work_order_number);
    }

}
