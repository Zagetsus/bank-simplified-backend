package com.banksimplifiedbackend.services;

import com.banksimplifiedbackend.domain.user.User;
import com.banksimplifiedbackend.dtos.NotificationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class NotificationService {
    @Autowired
    private RestTemplate restTemplate;

    public void sendNotification(User user, String message) throws Exception {
        String email = user.getEmail();
        NotificationDTO notificationRequest = new NotificationDTO(email, message);

        System.out.println("body request: "+ notificationRequest);
        ResponseEntity<Map> notificationResponse = restTemplate.getForEntity("https://run.mocky.io/v3/54dc2cf1-3add-45b5-b5a9-6bf7e7f1f4a6", Map.class);

        if (!(notificationResponse.getStatusCode() == HttpStatus.OK)) {
            System.out.println("Error sending notification");
            throw new Exception("Notification service is down");
        }

        boolean isApproved = (boolean) notificationResponse.getBody().get("message");

        if (!isApproved) throw new Exception("Notification service is down");

        System.out.println("Notification sent to the user");
    }
}
