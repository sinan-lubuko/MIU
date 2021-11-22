package w2d3;

import java.util.ArrayList;

public class AssetTracker {

    private ArrayList<Asset> assetList; //declaration

    public AssetTracker() {
        assetList = new ArrayList<>();//array list created
    }

    public void addAsset(Asset asset){
        assetList.add(asset);
    }

    public void deleteAsset(String serialNumber){
        int index = -1;
        for(int i = 0; i < assetList.size(); i++){
            if(assetList.get(i).getSerialNumber().equals(serialNumber)){
                index = i;
                break;
            }
        }
        if(index != -1){
            assetList.remove(index);
        }
    }

    public void modifyAsset(String serialNumber, Asset asset){
        int index = -1;
        for(int i = 0; i < assetList.size(); i++){
            if(assetList.get(i).getSerialNumber().equals(serialNumber)){
                index = i;
                break;
            }
        }
        if(index != -1){
            assetList.set(index, asset); //replace
        }
    }

    public Asset searchAsset(String serialNumber){
        for(Asset a: assetList){
            if(a.getSerialNumber().equals(serialNumber)){
                return a;
            }
        }
        return null; //the asset is not found
    }

    public void listAssetsByCategory(String category){
        System.out.println("Category: "+category);
        for(Asset a: assetList){
            if(a.getCategory().equals(category)){
                System.out.println(a);
            }
        }
    }

    public ArrayList<Asset> getAssetsByCategory(String category){
        ArrayList<Asset> list = new ArrayList<>();
        for(Asset a: assetList){
            if(a.getCategory().equals(category)){
                list.add(a);
            }
        }
        return list;
    }

}
