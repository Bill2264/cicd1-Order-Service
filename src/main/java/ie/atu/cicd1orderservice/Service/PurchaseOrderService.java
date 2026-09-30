package ie.atu.cicd1orderservice.Service;

import ie.atu.cicd1orderservice.Model.PurchaseOrder;
import ie.atu.cicd1orderservice.Repository.PurchaseOrderRepository;
import ie.atu.cicd1orderservice.client.CatalogClient;
import ie.atu.cicd1orderservice.dto.ProductResponse;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PurchaseOrderService {

    private final PurchaseOrderRepository purchaseOrderRepository;
    private final CatalogClient catalogClient;
    public PurchaseOrderService(PurchaseOrderRepository purchaseOrderRepository, CatalogClient catalogClient) {
        this.purchaseOrderRepository = purchaseOrderRepository;
        this.catalogClient = catalogClient;
    }

    public List<PurchaseOrder> getAll() {
        return purchaseOrderRepository.findAll();
    }

    public PurchaseOrder create(PurchaseOrder purchaseOrder) {
        purchaseOrder.setId(null);
        return purchaseOrderRepository.save(purchaseOrder);
    }

    public ProductResponse TestCatalogConnection(Long ProductId)
    {
        return catalogClient.GetProductById(ProductId);
    }
}
