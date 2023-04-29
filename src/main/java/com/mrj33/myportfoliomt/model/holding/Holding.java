package com.mrj33.myportfoliomt.model.holding;

import com.mrj33.myportfoliomt.model.AddNewStock;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="holdings")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Holding {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Stock Name cannot be empty", groups = AddNewStock.class)
    @Column(name = "stockname")
    private String name;
    @NotBlank(message = "Symbol cannot be empty", groups = AddNewStock.class)
    @Column
    private String symbol;
    @NotNull(message = "Price cannot be null", groups = AddNewStock.class)
    @Min(value = 0, message = "Price should be more than 0", groups = AddNewStock.class)
    @Column
    private Double price;
    @NotNull(message = "Quantity cannot be null", groups = AddNewStock.class)
    @Min(value = (long) 0.0, message = "Quantity should be more than 0", groups = AddNewStock.class)
    @Column(name = "quantity")
    private Double qty;
    @NotNull(message = "Quantity cannot be null", groups = AddNewStock.class)
    @Min(value = (long) 0.0, message = "Quantity should be more than 0", groups = AddNewStock.class)
    @Column(name = "universe")
    private String stockUniverse;
    @NotBlank(message = "Please provide the sector", groups = AddNewStock.class)
    @Column
    private String sector;
    @NotBlank(message = "Please provide exchange", groups = AddNewStock.class)
    @Column
    private String exchange;
    @NotBlank(message = "Please provide country where it is traded", groups = AddNewStock.class)
    @Column
    private String country;
}
