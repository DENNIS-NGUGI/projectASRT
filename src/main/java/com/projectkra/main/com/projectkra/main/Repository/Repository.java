package com.projectkra.main.com.projectkra.main.Repository;

import com.projectkra.main.com.projectkra.main.Model.Work_Order;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import java.util.List;


@org.springframework.stereotype.Repository
//@Component
public interface Repository extends JpaRepository<Work_Order, Long> {
    List<Work_Order> findAll();
    Work_Order findById(String work_order_number);
    void saveWorkOrder(Work_Order workOrder);
    void deleteById(String work_order_number);

}
