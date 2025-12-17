package org.example.bmssept24.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "seats")
public class Seat extends BaseModel {
    private String seatNumber;
    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;
    @Column(name = "row_num")
    private int rowNumber;
    @Column(name = "col_num")
    private int columnNumber;
}
