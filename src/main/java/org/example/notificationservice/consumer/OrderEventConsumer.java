package org.example.notificationservice.consumer;

import org.example.notificationservice.event.OrderEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderEventConsumer {

    @KafkaListener(
            topics = "medicine-stock-events",
            groupId = "notification-service-group"
    )
    public void consumeOrderEvent(OrderEvent event) {

        System.out.println(
                "Hóa đơn cho đơn hàng [" +
                        event.getOrderId() +
                        "] đã được gửi tới khách hàng"
        );
    }
}
