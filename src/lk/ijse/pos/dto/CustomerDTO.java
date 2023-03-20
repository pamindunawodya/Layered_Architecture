package lk.ijse.pos.dto;

import lk.ijse.pos.entity.Item;
import lk.ijse.pos.entity.Orders;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/

public class CustomerDTO implements Serializable {
    private String id;
    private String name;
    private String address;


    private List<OrderDTO>orderDTOList=new ArrayList<>();

    public CustomerDTO() {
    }

    public CustomerDTO(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;

    }

    public List<OrderDTO> getOrderDTOList() {
        return orderDTOList;
    }

    public void setOrderDTOList(List<OrderDTO> orderDTOList) {
        this.orderDTOList = orderDTOList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
