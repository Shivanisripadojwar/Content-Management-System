package com.management.Content;

public class Content {
    private Long id;
    private String Screen;
    private String Description;

    public Content(Long id, String screen, String description) {
        this.id = id;
        this.Screen = screen;
        this.Description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScreen() {
        return Screen;
    }

    public void setScreen(String screen) {
        Screen = screen;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }


}
