package lk.ijse.gdse.helloshoesbackend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
//@Table(name = "gender")
@Data
public class GenderEntity {
    @Id
    private String genderCode;
    private String genderDesc;
    @OneToMany(mappedBy = "genderEntity",cascade = CascadeType.ALL)
    private List<ItemEntity> itemEntities;

}
