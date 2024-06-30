package com.kcdhawan.utri.eco.app.repositories.orders;

import com.kcdhawan.utri.eco.app.modules.cart.CartEntity;
import com.kcdhawan.utri.eco.app.modules.order.OrdersEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepositoryCustom {

    OrdersEntity findOrderByOrderId(String razorpay_order_id);
    OrdersEntity findOrderById(Integer id);

    Integer getCompletedOrders();
    Integer getCreatedOrders();

    Integer getCompletedOrdersViaUserID(Integer UserID);
    Integer getCreatedOrdersViaUserID(Integer UserId);

    Double getTotalPaymentsReceived();


}
