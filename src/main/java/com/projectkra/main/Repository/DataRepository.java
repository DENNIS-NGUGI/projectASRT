package com.projectkra.main.Repository;

import com.projectkra.main.Model.Work_Order;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface DataRepository extends JpaRepository<Work_Order, String> {
    /*    List<Work_Order> findAll();*/

}
