package com.eb2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Event {

    private String id;
    private String type;
    private Actor actor;
    private Repo repo;
    private Payload payload;
    private boolean welcomePublic;
    private String createdAt;
    private Org org;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("actor")
    public Actor getActor() { return actor; }
    @JsonProperty("actor")
    public void setActor(Actor value) { this.actor = value; }

    @JsonProperty("repo")
    public Repo getRepo() { return repo; }
    @JsonProperty("repo")
    public void setRepo(Repo value) { this.repo = value; }

    @JsonProperty("payload")
    public Payload getPayload() { return payload; }
    @JsonProperty("payload")
    public void setPayload(Payload value) { this.payload = value; }

    @JsonProperty("public")
    public boolean getWelcomePublic() { return welcomePublic; }
    @JsonProperty("public")
    public void setWelcomePublic(boolean value) { this.welcomePublic = value; }

    @JsonProperty("created_at")
    public String getCreatedAt() { return createdAt; }
    @JsonProperty("created_at")
    public void setCreatedAt(String value) { this.createdAt = value; }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isWelcomePublic() {
        return welcomePublic;
    }

    public Org getOrg() {
        return org;
    }

    public void setOrg(Org org) {
        this.org = org;
    }

    @Override
    public String toString() {
        return "Response{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", actor=" + actor +
                ", repo=" + repo +
                ", payload=" + payload +
                ", welcomePublic=" + welcomePublic +
                ", createdAt='" + createdAt + '\'' +
                ", org=" + org +
                '}';
    }
}
