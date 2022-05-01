package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class MovieItem {

    private int id;
    private String movieName;
    private int price;
    private int rating;


}
