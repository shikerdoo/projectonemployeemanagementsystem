package com.example.EmployeeManagementSystem.EMS.demo.Service;

import com.example.EmployeeManagementSystem.EMS.demo.Models.Asset;
import com.example.EmployeeManagementSystem.EMS.demo.Repository.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AssetServiceImpl implements AssetService{
    @Autowired
    private AssetRepository assetRepository;
    AssetServiceImpl(AssetRepository assetRepository)
    {
        this.assetRepository=assetRepository;
    }
    @Override
    public Asset saveAsset(Asset asset) {
        return assetRepository.save(asset);
    }

    @Override
    public List<Asset> getAllAsset() {
        return assetRepository.findAll();
    }

    @Override
    public Asset getAssetById(int id) {
        return assetRepository.findById(id).orElseThrow();
    }

    @Override
    public Asset updateAsset(Asset asset, int id) {
        Asset existingAsset=assetRepository.findById(id).orElseThrow();
        existingAsset.setName(asset.getName());
        existingAsset.setShortname(asset.getShortname());
        existingAsset.setSalary(asset.getSalary());
        existingAsset.setLeaves(asset.getLeaves());

        return existingAsset;
    }

    @Override
    public void deleteAsset(int id) {
        assetRepository.findById(id).orElseThrow();
        assetRepository.deleteById(id);
    }
}
