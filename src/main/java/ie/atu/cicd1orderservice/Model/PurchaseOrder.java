package ie.atu.cicd1orderservice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseOrder {
    private long id;
    private long productId;
    private int quantity;
}
