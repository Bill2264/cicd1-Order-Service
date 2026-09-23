package ie.atu.cicd1orderservice.Service;

import ie.atu.cicd1orderservice.Model.PurchaseOrder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PurchaseOrderService {

    private final List<PurchaseOrder> orders = new ArrayList<>();
    private long nextId = 1;

    public List<PurchaseOrder> getAll() {
        return orders;
    }

    public PurchaseOrder create(PurchaseOrder purchaseOrder) {
        purchaseOrder.setId(nextId++);
        orders.add(purchaseOrder);
        return purchaseOrder;
    }
}
