package w2d3;

import java.util.ArrayList;

public class AssetTrackerMainApp {

    public static void main(String[] args){

        Asset asset1 = new Furniture("Chair", "F01");
        Asset asset2 = new Furniture("Bed", "F02");
        Asset asset3 = new ElectronicAppliance("TV", "E01");
        Asset asset4 = new ElectronicAppliance("Laptop", "E02");
        Asset asset5 = new CompactDisk("Katty Perry Collections", "C01");
        Asset asset6 = new CompactDisk("Video Tutorials", "C02");
        Asset asset7 = new Automobile("Toyota Camry", "A01");;
        Asset asset8 = new Automobile("Ford Explorer", "A02");

        AssetTracker assetTracker = new AssetTracker(); //Constructor
        assetTracker.addAsset(asset1);
        assetTracker.addAsset(asset2);
        assetTracker.addAsset(asset5);
        assetTracker.addAsset(asset6);
        assetTracker.addAsset(asset8);
        assetTracker.addAsset(asset7);
        assetTracker.addAsset(asset4);
        assetTracker.addAsset(asset3);


        ArrayList<Asset> automobilesList = assetTracker.getAssetsByCategory("auto");
        System.out.println(automobilesList);

        assetTracker.deleteAsset("A01"); //deletes A02
        assetTracker.listAssetsByCategory("auto");

        Asset a = assetTracker.searchAsset("C02");
        System.out.println(a);

    }
}
