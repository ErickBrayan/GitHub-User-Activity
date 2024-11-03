package com.eb2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Org {
    private long id;
    private String login;
    private String gravatarId;
    private String url;
    private String avatarUrl;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @JsonProperty("gravatar_id")
    public String getGravatarId() {
        return gravatarId;
    }

    @JsonProperty("gravatar_id")
    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("avatar_url")
    public String getAvatarUrl() {
        return avatarUrl;
    }
    @JsonProperty("avatar_url")
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @Override
    public String toString() {
        return "Org{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", gravatarId='" + gravatarId + '\'' +
                ", url='" + url + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                '}';
    }
}
