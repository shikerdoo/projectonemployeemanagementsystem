package com.example.EmployeeManagementSystem.EMS.demo.Controller;

import com.example.EmployeeManagementSystem.EMS.demo.Models.Asset;
import com.example.EmployeeManagementSystem.EMS.demo.Service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/asset")
@RestController
public class AssetController {
    @Autowired
    private AssetService assetService;
    public AssetController(AssetService assetService)
    {
        this.assetService=assetService;
    }
    @PostMapping("/create")
    public Asset saveAsset(@RequestBody Asset asset)
    {
        return assetService.saveAsset(asset);
    }
    @GetMapping("/all")
    public List<Asset> getAllAsset()
    {
        return assetService.getAllAsset();
    }
    @GetMapping("{id}")
    public Asset getAssetById(@PathVariable("id") int id)
    {
        return (assetService.getAssetById(id));
    }
    @PutMapping("/update/{id}")
    public Asset updateAsset(@PathVariable("id")int id,@RequestBody Asset asset)
    {
        return (assetService.updateAsset(asset,id));
    }
    @DeleteMapping("/delete/{id}")
    public String deleteAsset(@PathVariable("id")int id)
    {
        assetService.deleteAsset(id);
        return "Employee deleted successfully";
    }
}
