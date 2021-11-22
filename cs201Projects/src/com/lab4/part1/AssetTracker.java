package com.lab4.part1;

import java.util.ArrayList;
import java.util.List;

public class AssetTracker {

    private List<Asset> assetList;

    public AssetTracker() {
        this.assetList = new ArrayList<>();
    }

    public void addAsset(Asset a){
        assetList.add(a);
    }

    public void deleteAsset(Asset a){
        assetList.remove(a);
    }

    public static void main(String[] args){
        AssetTracker assetTracker = new AssetTracker();

        Asset electronics = new ElectronicAppliance("E001");
        Asset furniture = new Furniture("F001");
        Asset automobile = new Automobile("A001");
        Asset disk = new CompactDisk("D001");

        //adds the assets
        assetTracker.addAsset(electronics);
        assetTracker.addAsset(furniture);
        assetTracker.addAsset(automobile);
        assetTracker.addAsset(disk);
        assetTracker.addAsset(new Automobile("A002"));

        //removes the furniture
        assetTracker.deleteAsset(furniture);

    }
}
