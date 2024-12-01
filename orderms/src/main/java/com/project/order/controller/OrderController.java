package com.project.order.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.order.model.Orders;
import com.project.order.service.OrderService;

@RestController
@RequestMapping ("/orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    /**
     * Fetch all orders
     * 
     * @return
     */
    @GetMapping (value = "/all-orders", produces = "application/json")
    public List<Orders> fetchAllOrders () {
        return orderService.getAllOrders ();
    }

    /**
     * Fetch order by Id for customer
     * 
     * @param id
     * @return
     */
    @GetMapping (value = "/{id}", produces = "application/json")
    public Optional<Orders> fetchOrderById (@PathVariable long id) {
        return orderService.getOrderById (id);
    }

    /**
     * Create Order for customer
     * 
     * @param order
     * @return
     */
    @PostMapping (value = "/create-order", consumes = "application/json", produces = "application/json")
    public Orders createNewOrder (@RequestBody Orders order) {
        return orderService.createOrder (order);
    }

    /**
     * Update order for customer
     * 
     * @param id
     * @param updatedOrder
     * @return
     */
    @PutMapping (value = "update/{id}", produces = "application/json", consumes = "application/json")
    public Orders updateOrder (@PathVariable long id, @RequestBody Orders updatedOrder) {
        return orderService.updateOrder (id, updatedOrder);
    }

    /**
     * Delete order for customer
     * 
     * @param id
     * @return
     */
    @DeleteMapping (value = "delete/{id}", produces = "application/json")
    public ResponseEntity<String> deleteAnyOrderById (@PathVariable long id) {
        String message = orderService.deleteBook (id);
        return ResponseEntity.ok ("{\"message\": \"" + message + "\"}");
    }

}
