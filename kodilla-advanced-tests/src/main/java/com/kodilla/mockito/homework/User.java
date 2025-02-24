package com.kodilla.mockito.homework;

import java.util.List;

public interface User {

    Long getId(); // Metoda do pobierania ID użytkownika
    String getUserName(); // Metoda do pobierania nazwy użytkownika
    void addLocation(String location); // Dodanie lokalizacji
    void removeLocation(String location); // Usunięcie lokalizacji
    void removeAllLocations(); // Usunięcie wszystkich lokalizacji
    List<String> getLocations(); // Pobranie listy lokalizacji
    void receive(Notification notification); // Odbieranie powiadomienia
}

