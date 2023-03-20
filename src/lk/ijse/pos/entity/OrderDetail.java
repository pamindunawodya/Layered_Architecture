package lk.ijse.pos.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class OrderDetail implements Serializable {

    @ManyToOne
    private Item item;

    @Id
    private String itemCode;
    private int qty;
    private BigDecimal unitPrice;

    @ManyToOne
    private Orders orders;

    @Id
    private String oid;

    public OrderDetail() {
    }

    public OrderDetail(String itemCode, Item item, int qty, BigDecimal unitPrice, Orders orders, String oid) {
        this.itemCode = itemCode;
        this.item = item;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.orders = orders;
        this.oid = oid;
    }



    public OrderDetail(String oid, String itemCode, int qty, BigDecimal unitPrice) {
        this.oid = oid;
        this.itemCode = itemCode;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "item=" + item +
                ", itemCode='" + itemCode + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                ", orders=" + orders +
                ", oid='" + oid + '\'' +
                '}';
    }
}
