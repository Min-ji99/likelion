package com.line.domain;

public class Hospital {
    private String id;
    private String address;
    private String district;
    private String category;
    private int emergencyRoom;
    private String name;
    private String subdivision;

    public Hospital(String id, String address, String district, String category, String emergencyRoom, String name, String subdivision){
        this.id=id;
        this.address=address;
        this.district=district;
        this.category=category;
        this.emergencyRoom=Integer.parseInt(emergencyRoom);
        this.name=name;
        this.subdivision=subdivision;
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
    public String getInsert1() {
        String insertQuery="INSERT INTO `seoulhospital`.`seoul_hospital` (`id`, `address`, " +
                "`district`, `category`, `emergency_room`, `name`, `subdivision`) VALUES ('"
                + this.id + "', '" + this.address + "', '" + this.district + "', '" + this.category
                + "', " + this.emergencyRoom + ", '" + this.name+"', ";

        if (this.subdivision.length()>0){
            insertQuery+="'"+this.subdivision+"');\n";
        }else{
            insertQuery+="null);\n";
        }
        return insertQuery;

    }
    public String getInsert2() {
        String insertQuery=String.format("INSERT INTO `seoulhospital`.`seoul_hospital` (`id`, `address`, " +
                        "`district`, `category`, `emergency_room`, `name`, `subdivision`) VALUES ('%s', '%s', '%s', '%s', %d, '%s', '%s');\n",
                this.id, this.address,this.district,this.category,
                this.emergencyRoom, this.name, this.subdivision);


        return insertQuery;

    }
}
