package lk.ijse.pos.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Orders {
    @Id
    private String oid;
    private LocalDate date;
    private String customerID;

    @ManyToOne
    private Customer customer;

    @ManyToMany
    private List<Item>itemList=new ArrayList<>();

    public Orders() {
    }

    public Orders(String oid, LocalDate date, String customerID) {
        this.oid = oid;
        this.date = date;
        this.customerID = customerID;
    }

    public Orders(String oid, LocalDate date, String customerID, List<Item> itemList) {
        this.oid = oid;
        this.date = date;
        this.customerID =    customerID;
        this.itemList = itemList;
    } 
    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oid='" + oid + '\'' +
                ", date=" + date +
                ", customerID='" + customerID + '\'' +
                '}';
    }
}
