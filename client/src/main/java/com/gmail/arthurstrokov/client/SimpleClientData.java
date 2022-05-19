package com.gmail.arthurstrokov.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimpleClientData {
    private int id;
    private String name;
    private int amount;
}
