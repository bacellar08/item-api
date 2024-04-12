package com.itemsapi.itemsapi.item;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.itemsapi.itemsapi.item.ItemRequestDTO;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String productName;
    String description;
    Double price;
    Integer quantity;
    String image;

    public Item(ItemRequestDTO data) {
        this.productName = data.productName;
        this.description = data.description;
        this.price = data.price;
        this.quantity = data.quantity;
        this.image = data.image;
    }

}
