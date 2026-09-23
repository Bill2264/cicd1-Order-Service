package ie.atu.cicd1orderservice.Service;

import ie.atu.cicd1orderservice.Model.PurchaseOrder;
import ie.atu.cicd1orderservice.Repository.PurchaseOrderRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PurchaseOrderService {

    private final PurchaseOrderRepository purchaseOrderRepository;
    public PurchaseOrderService(PurchaseOrderRepository purchaseOrderRepository) {
        this.purchaseOrderRepository = purchaseOrderRepository;
    }

    public List<PurchaseOrder> getAll() {
        return purchaseOrderRepository.findAll();
    }

    public PurchaseOrder create(PurchaseOrder purchaseOrder) {
        return purchaseOrderRepository.save(purchaseOrder);
    }
}
