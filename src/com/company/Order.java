package com.company;

import java.time.LocalDate;

public interface Order {
    public double getCost();

    public String getTitle();

    public int getQuantityOnHand();

    public LocalDate getReleaseDate();

    public void order(int quantity);

    public String getFormattedReleaseDate();


}
