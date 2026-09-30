package ie.atu.cicd1orderservice.Repository;

import ie.atu.cicd1orderservice.Model.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder,Long> {
}
