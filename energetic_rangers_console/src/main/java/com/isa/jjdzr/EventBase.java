package com.isa.jjdzr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EventBase {
    public void showEvents (){

        List<List<String>> events = new ArrayList<>();  //tworzymy listę eventów. Każdym elementem listy też będzie lista - będą to wartości z poszczególnych kolumn
        try (BufferedReader br = new BufferedReader(new FileReader("energetic_rangers_console/src/main/resources/eventsBase.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {    // dopóki istnieje kolejna linia (wiersz w csv), wczytujemy ją
                String[] valuesInColumns = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)"); //dzielimy każdy wiersz na kolumny (split), korzystajac z tego, że w pliku csv wartości w kolejnych kolumnach podzielone są przecinkami. Ponieważ same wartości też zawieraja przecinki, nie możemy zrobić po prostu split(","), tylko stosujemy wyrażenie regularne i dzilimy po przecinkach nie znajdujących się w cudzysłowach (wyrażenie regularne ze stackoverflow)
                events.add(Arrays.asList(valuesInColumns).stream().map(s -> s.replace("\"", "")).collect(Collectors.toList())); //do listy eventów dodajemy poszczególne eventy, czyli listy wartości z kolumn dla danego wiersza. Ponieważ nie chcemy, żeby w wynikowej liście znalazły się cudzysłowy, które służą prawidłowemu wyświetlaniu wartości zawierajacych przecinki, w locie zamieniamy cudzysłowy na puste Stringi, czyli je usuwamy
            }
        } catch (IOException e) {
            System.err.println("Error during import");
        }

        for (List<String> event : events) { //wyświetlamy wynik lub możemy z nim zrobić, co nam się podoba
            for (String column : event) {
                System.out.print(column + ", ");
            }
            System.out.println("\n");

        }}
}
