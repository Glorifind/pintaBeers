package com.pintabestbeers.model;

/**
 * Java representation of beer list item to be displayed in the RecyclerView
 * Created by Adam on 15.01.2017.
 */

public class BeerListItem {

    private String beerName;
    private int beerBootleImage;

    public BeerListItem(String beerName, int beerBootleImage) {
        this.beerName = beerName;
        this.beerBootleImage = beerBootleImage;
    }

    public String getBeerName() {
        return this.beerName;
    }

    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }

    public int getBeerBootleImage() {
        return this.beerBootleImage;
    }

    public void setBeerBootleImage(int beerBootleImage) {
        this.beerBootleImage = beerBootleImage;
    }
}
