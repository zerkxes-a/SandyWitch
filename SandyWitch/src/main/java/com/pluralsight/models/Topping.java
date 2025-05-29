package com.pluralsight.models;
//TODO DONT TOUCH THIS ITS G O O D THIS IS YOUR NO NO CLASS
public class Topping{
    public String type;
    public String name;

    public Topping(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public static boolean isExtra() {
        return true;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getPrice(String size){
        switch (size){
            case "small"->{
                switch(type){
                    case "meat" -> {return 1.00;}
                    case "cheese" -> {return 0.75;}
                    case "extra meat" -> {return 0.50;}
                    case "extra cheese" ->{return 0.30;}
                    default -> {
                        return 0;
                    }

                }
            }
            case "medium"->{
                switch(type){
                    case "meat" -> {return 2.00;}
                    case "cheese" -> {return 1.50;}
                    case "extra meat" -> {return 1.00;}
                    case "extra cheese" ->{return 0.60;}
                    default -> {
                        return 0;
                    }

                }
            }
            case "large"->{
                switch(type){
                    case "meat" -> {return 3.00;}
                    case "cheese" -> {return 2.25;}
                    case "extra meat" -> {return 1.50;}
                    case "extra cheese" ->{return 0.90;}
                    default -> {
                        return 0;
                    }

                }
            }
        }
        return 0;
    }
}
