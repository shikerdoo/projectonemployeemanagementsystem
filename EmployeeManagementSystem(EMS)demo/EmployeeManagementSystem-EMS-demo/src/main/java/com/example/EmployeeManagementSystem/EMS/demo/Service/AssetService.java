package com.example.EmployeeManagementSystem.EMS.demo.Service;

import com.example.EmployeeManagementSystem.EMS.demo.Models.Asset;

import java.util.List;

public interface AssetService {
    Asset saveAsset(Asset asset);
    List<Asset> getAllAsset();


    Asset getAssetById(int id);

    Asset updateAsset(Asset asset, int id);
    void deleteAsset(int id);

}
