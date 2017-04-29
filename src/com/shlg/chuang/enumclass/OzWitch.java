package com.shlg.chuang.enumclass;

public enum OzWitch {

    WEST("Miss Gulch, aka the Wicked Witch of the West"),
    NORTH("Glinda, the Good Witch of the North"),
    EAST("Wicked Witch of the East, wearer of the Ruby " +
            "Splippers, crushed by Dorothy's house"),
    SOUTH("Good by inference, bjut missing");
    
    private OzWitch(String description) {
        this.description = description;
    }
    
    private String description;
    
    public String getDescription() {
        return description;
    }
    
    public static void main(String[] args) {
        for (OzWitch witch : OzWitch.values())
            System.out.println(witch + ": " + witch.getDescription());
    }
}
