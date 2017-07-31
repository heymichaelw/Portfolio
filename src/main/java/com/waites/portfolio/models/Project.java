package com.waites.portfolio.models;

public class Project {

    private long id;
    private String title;
    private String description;
    private String imageURL;
    private String repoURL;

    public Project(long id, String title, String description, String imageURL, String repoURL) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.imageURL = imageURL;
        this.repoURL = repoURL;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getRepoURL() {
        return repoURL;
    }

    public void setRepoURL(String repoURL) {
        this.repoURL = repoURL;
    }
}
