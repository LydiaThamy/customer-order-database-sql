package sg.nus.edu.iss.day21_workshop.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private int id;
    private int employeeId;
    private int customerId;
    private Date orderDate;
    private Date shippedDate;
    private int shipperId;
    private String shipName;
    private String shipAddress;
    private String shipCity;
    private String shipStateProvince;
    private String shipZipPostalCode;
    private String shipCountryRegion;
    private double shippingFee;
    private double taxes;
    private String paymentType;
    private Date paidDate;
    private String notes;
    private double taxRate;
    private int taxStatusId;
    private int statusId;
    
}
