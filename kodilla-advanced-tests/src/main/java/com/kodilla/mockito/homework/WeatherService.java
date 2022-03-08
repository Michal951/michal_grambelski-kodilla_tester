package com.kodilla.mockito.homework;


import com.kodilla.notification.Notification;

import java.util.*;


public class WeatherService {
    private Map<Location, List<Client>> notifications = new HashMap<>();

    public void addClient(Client client) {
        clients.add(client);
    }

    public void addCLientToLocation(Location location, Client client) {
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
            notifications.get(location).forEach(client -> client.receiveNotification(notification));
        }
    }

    List<Client> clients = new ArrayList<>();

    public void sendNotificationsToAllClients(Notification notification) {

        clients.forEach(customer -> customer.receiveNotification(notification));
    }


    public void deleteNotification(Client client, Location location) {
        if (notifications.containsKey(location)) {
            notifications.get(location).remove(client);
        }
    }

    public void removeClientFromAllLocations(Client client) {
        notifications.values().forEach(customers -> customers.remove(client));

    }


    public void removeLocation(Location location) {
        this.notifications.remove(location);
    }

}