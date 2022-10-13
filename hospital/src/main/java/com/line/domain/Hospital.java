package com.line.domain;

public class Hospital {
    private String id;
    private String address;
    private String district;
    private String category;
    private int emergencyRoom;
    private String name;
    private String subdivision;

    public Hospital(String id, String address, String district, String category, String emergencyRoom, String name){
        this.id=id;
        this.address=address;
        this.district=district;
        this.category=category;
        this.emergencyRoom=Integer.parseInt(emergencyRoom);
        this.name=name;
    }
    public String getId() {
        return id;
    }
    public String getAddress(){
        return address;
    }
    public String getDistrict(){
        return district;
    }
    public int getEmergencyRoom() {
        return emergencyRoom;
    }
    public String getCategory() {
        return category;
    }
    public String getName() {
        return name;
    }
    public String getSubdivision() {
        return subdivision;
    }
}
