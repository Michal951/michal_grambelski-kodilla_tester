package com.kodilla.mockito.homework;


import com.kodilla.notification.Notification;

import java.util.*;


public class WeatherService {
    private Map<Location, List<Client>> notifications = new HashMap<>();


    public void addSubscriberToLocation(Location location, Client client) {
        if (notifications.containsKey(location)) {
            notifications.get(location).add(client);
        } else {
            List<Client> clients = new ArrayList<>();
            clients.add(client);
            notifications.put(location, clients);
        }


    }

    public void sendNotifications(Notification notification, Location location) {
        if (notifications.containsKey(location)) {
            notifications.get(location).forEach(customer -> customer.receiveNotification(notification));
        }
    }

    List<Client> clients = new ArrayList<>();

    public void sendNotificationsToAllCustomers(Notification notification) {

        clients.forEach(customer -> customer.receiveNotification(notification));
    }

    public void addSubscriber(Client client) {
        clients.add(client);
    }


    public void removeSubscribedLocation(Client client, Location location) {
        if (notifications.containsKey(location)) {
            notifications.get(location).remove(client);
        }
    }

    public void removeCustomerFromAllLocations(Client client) {
        notifications.values().forEach(customers -> customers.remove(client));

    }


    public void removeLocation(Location location) {
        this.notifications.remove(location);
    }

}
