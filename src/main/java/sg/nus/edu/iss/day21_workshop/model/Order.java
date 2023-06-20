package sg.nus.edu.iss.day21_workshop.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private Integer id;
    private Integer employeeId;
    private Integer customerId;
    private Date orderDate;
    private Date shippedDate;
    private Integer shipperId;
    private String shipName;
    private String shipAddress;
    private String shipCity;
    private String shipStateProvince;
    private String shipZipPostalCode;
    private String shipCountryRegion;
    private Double shippingFee;
    private Double taxes;
    private String paymentType;
    private Date paidDate;
    private String notes;
    private Double taxRate;
    private Integer taxStatusId;
    private Integer statusId;
    
}
