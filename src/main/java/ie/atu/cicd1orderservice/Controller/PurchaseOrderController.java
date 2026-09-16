package ie.atu.cicd1orderservice.Controller;

import ie.atu.cicd1orderservice.Model.PurchaseOrder;
import ie.atu.cicd1orderservice.Service.PurchaseOrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class PurchaseOrderController {
    private final PurchaseOrderService purchaseOrderService;

    public PurchaseOrderController(PurchaseOrderService purchaseOrderService) {
        this.purchaseOrderService = purchaseOrderService;
    }

    @GetMapping
    public List<PurchaseOrder> getPurchaseOrders() {
        return purchaseOrderService.getAll();
    }

    @PostMapping
    public PurchaseOrder createPurchaseOrder(@RequestBody PurchaseOrder purchaseOrder) {
        return purchaseOrderService.create(purchaseOrder);
    }
}
