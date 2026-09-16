package ie.atu.cicd1orderservice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseOrder {
    private long Id;
    private long productId;
    private int quantity;
}
