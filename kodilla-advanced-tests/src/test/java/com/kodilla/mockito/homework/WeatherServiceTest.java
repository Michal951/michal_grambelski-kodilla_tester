package com.kodilla.mockito.homework;

import com.kodilla.notification.Notification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherServiceTest {
    WeatherService weatherService = new WeatherService();
    Client client = Mockito.mock(Client.class);
    Location location = Mockito.mock(Location.class);
    Notification notification = Mockito.mock(Notification.class);


    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {
        weatherService.addClient(client);
        weatherService.deleteClientFromAllLocations(client);

        weatherService.sendNotifications(notification, location);
        Mockito.verify(client, Mockito.never()).receiveNotification(notification);
    }


    @Test
    public void subscribedClientShouldReceiveNotification() {
        weatherService.addClient(client);

        weatherService.sendNotifications(notification, location);
        Mockito.verify(client, Mockito.times(1)).receiveNotification(notification);
    }

    @Test
    public void deleteIndicatedLocation() {
        Location location1 = Mockito.mock(Location.class);
        weatherService.addClient(client);
        weatherService.addCLientToLocation(location1, client);
        weatherService.deleteLocation(location1);

        weatherService.sendNotifications(notification, location1);
        Mockito.verify(client, Mockito.never()).receiveNotification(notification);

    }

    @Test
    public void ShouldSendNotificationToAllClients() {
        Client client1 = Mockito.mock(Client.class);
        Client client2 = Mockito.mock(Client.class);

        weatherService.addClient(client1);
        weatherService.addClient(client2);


        weatherService.sendNotificationsToAllClients(notification);
        Mockito.verify(client1, Mockito.times(1)).receiveNotification(notification);
        Mockito.verify(client2, Mockito.times(1)).receiveNotification(notification);

    }

    @Test
    public void UnsubscribedAllLocationShouldDeletedCustomerFromNotification() {
        Location location1 = Mockito.mock(Location.class);
        weatherService.addCLientToLocation(location, client);
        weatherService.addCLientToLocation(location1, client);
        weatherService.deleteClientFromAllLocations(client);
        weatherService.deleteSubscribedLocation(client,location);


        weatherService.sendNotifications(notification, location);
        weatherService.sendNotifications(notification, location1);
        Mockito.verify(client, Mockito.never()).receiveNotification(notification);

    }
}