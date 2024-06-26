package lk.ijse.gdse.helloshoesbackend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "stock")
@Data
public class StockEntity {
    @Id
    private String stockId;
    @ManyToOne
    @JoinColumn(name = "supplierCode",nullable = false)
    private SupplierEntity supplierEntity;

    @ManyToOne
    @JoinColumn(name = "itemCode",nullable = false)
    private ItemEntity itemEntity;
    private Date supplierOrderDate;

    @OneToMany(mappedBy = "stockEntity",cascade = CascadeType.ALL)
    private List<StockSizeEntity> stockSizeEntities;
}
