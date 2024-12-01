package com.project.order.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.order.exception.OrderNotFoundException;
import com.project.order.model.Orders;
import com.project.order.repository.OrdersRepository;

@Component
public class OrderService {

    @Autowired
    OrdersRepository            ordersRepository;
    private static List<Orders> orders = new ArrayList<> ();

    public List<Orders> getAllOrders () {
        orders = ordersRepository.findAll ();
        return orders;
    }

    public Optional<Orders> getOrderById (long id) {
        Optional<Orders> order = ordersRepository.findById (id);
        if (order.isEmpty ()) {
            throw new OrderNotFoundException ("No Orders found against the order id:" + id);
        }
        return order;
    }

    /**
     * Creates a new Order for Customer
     * 
     * @param order
     * @return
     */
    public Orders createOrder (Orders order) {
        order.setUpdatedAt (order.getUpdatedAt ());
        order.setCreatedAt (order.getCreatedAt ());
        order.setCustomerId (order.getCustomerId ());
        order.setOrderId (order.getOrderId ());
        order.setOrderStatus (order.getOrderStatus ());
        order.setPackageSize (order.getPackageSize ());
        order.setPackageWeight (order.getPackageWeight ());
        order.setPickUpAddress (order.getPickUpAddress ());
        order.setPriorityLevel (order.getPriorityLevel ());
        order.setDeliveryAddress (order.getDeliveryAddress ());

        ordersRepository.save (order);

        return order;
    }

    public Orders updateOrder (long id, Orders updatedOrder) {
        getAllOrders ();
        for (Orders order : orders) {
            if (order.getOrderId () == id) {
                order.setUpdatedAt (updatedOrder.getUpdatedAt ());
                order.setCreatedAt (updatedOrder.getCreatedAt ());
                order.setCustomerId (updatedOrder.getCustomerId ());
                order.setOrderId (updatedOrder.getOrderId ());
                order.setOrderStatus (updatedOrder.getOrderStatus ());
                order.setPackageSize (updatedOrder.getPackageSize ());
                order.setPackageWeight (updatedOrder.getPackageWeight ());
                order.setPickUpAddress (updatedOrder.getPickUpAddress ());
                order.setPriorityLevel (updatedOrder.getPriorityLevel ());
                order.setDeliveryAddress (updatedOrder.getDeliveryAddress ());
                ordersRepository.save (order);
                return order;
            }
        }
        throw new OrderNotFoundException ("No Orders found against the order id:" + id);

    }

    public String deleteBook (long id) {
        // TODO Auto-generated method stub
        return null;
    }

}
