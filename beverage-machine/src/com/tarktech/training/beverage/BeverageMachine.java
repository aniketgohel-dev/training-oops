package com.tarktech.training.beverage;

public class BeverageMachine {
    private int availableLatteCount;
    private int availableTeaCount;

    private int totalLatteDispensed;
    private int totalTeaDispensed;

    public BeverageMachine() {
        availableLatteCount = 5;
        availableTeaCount = 5;

        totalLatteDispensed = 0;
        totalTeaDispensed = 0;
    }

    public String makeBeverage(BeverageType beverageType) {
        switch (beverageType) {
            case Latte:
                if(availableLatteCount == 0){
                    throw new RuntimeException("Sorry! Latte is out of stock!");
                }
                totalLatteDispensed++;
                availableLatteCount--;
                return "Enjoy your hot Latte with creamy milk!";
            case Tea:
                if(availableTeaCount == 0){
                    throw new RuntimeException("Sorry! Tea is out of stock!");
                }
                totalTeaDispensed++;
                availableTeaCount--;
                return "Enjoy your hot Masala Tea!";
            default:
                throw new RuntimeException("Unsupported beverage: " + beverageType);
        }
    }

    public int getBeveragesDrunkByUser(BeverageType beverageType) {
        switch (beverageType) {
            case Latte:
                return totalLatteDispensed;
            case Tea:
                return totalTeaDispensed;
        }
        return 0;
    }

    public int getAvailableBeverages(BeverageType beverageType){
        switch (beverageType) {
            case Latte:
                return availableLatteCount;
            case Tea:
                return availableTeaCount;
        }
        return 0;
    }

    public int getTotalBeveragesDrunkByUser(){
        return totalLatteDispensed + totalTeaDispensed;
    }

    public int getTotalAvailableBeverages(){
        return availableLatteCount + availableTeaCount;
    }
}
