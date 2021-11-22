package com.lab4.part1;

public class Asset {

    protected String assetId;
    protected String type;

    public Asset(String assetId, String type) {
        this.assetId = assetId;
        this.type = type;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
