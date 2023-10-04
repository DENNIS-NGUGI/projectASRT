package com.projectkra.main.Service;

import com.projectkra.main.Model.Work_Order;
import com.projectkra.main.Repository.DataRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Service
public class DataService {
/*    @Autowired*/
    private final DataRepository dataRepository;

    public DataService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
     }

    public List<Work_Order> fetchAll() {
        return dataRepository.findAll();
    }
    public Map<String, Long> countChoices() {
        List<Work_Order> workOrder = dataRepository.findAll();

        Map<String, Long> counts = new HashMap<>();
        for (Work_Order d : workOrder) {
            String choice = d.getWork_status();
            Long count = counts.get(choice);
            if (count == null) {
                count = 0L;
            }
            count++;
            counts.put(choice, count);
        }

        return counts;
    }

    public Long countOpenChoices() {
        Long count = countChoices().get("open");
        return count == null ? 0L : count;
    }

    public Long countClosedChoices() {
        Long count = countChoices().get("closed");
        return count == null ? 0L : count;
    }

    public Long countPendingChoices() {
        Long count = countChoices().get("pending");
        return count == null ? 0L : count;
    }

    public Long countNewChoices() {
        Long count = countChoices().get("new");
        return count == null ? 0L : count;
    }


}
