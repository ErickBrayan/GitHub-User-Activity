package com.eb2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Payload {
    private long repositoryID;
    private long pushID;
    private long size;
    private long distinctSize;
    private String ref;
    private String refType;
    private String masterBranch;
    private String description;
    private String pusherType;
    private String head;
    private String before;
    private String action;
    private List<Commit> commits;

    @JsonProperty("repository_id")
    public long getRepositoryID() { return repositoryID; }
    @JsonProperty("repository_id")
    public void setRepositoryID(long value) { this.repositoryID = value; }

    @JsonProperty("push_id")
    public long getPushID() { return pushID; }
    @JsonProperty("push_id")
    public void setPushID(long value) { this.pushID = value; }

    @JsonProperty("size")
    public long getSize() { return size; }
    @JsonProperty("size")
    public void setSize(long value) { this.size = value; }

    @JsonProperty("distinct_size")
    public long getDistinctSize() { return distinctSize; }
    @JsonProperty("distinct_size")
    public void setDistinctSize(long value) { this.distinctSize = value; }

    @JsonProperty("ref")
    public String getRef() { return ref; }
    @JsonProperty("ref")
    public void setRef(String value) { this.ref = value; }

    @JsonProperty("ref_type")
    public String getRefType() { return refType; }
    @JsonProperty("ref_type")
    public void setRefType(String refType) { this.refType = refType; }

    @JsonProperty("master_branch")
    public String getMasterBranch() {
        return masterBranch;
    }
    @JsonProperty("master_branch")
    public void setMasterBranch(String masterBranch) {
        this.masterBranch = masterBranch;
    }
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }
    @JsonProperty("pusher_type")
    public String getPusherType() {
        return pusherType;
    }
    @JsonProperty("pusher_type")
    public void setPusherType(String pusherType) {
        this.pusherType = pusherType;
    }

    @JsonProperty("head")
    public String getHead() { return head; }
    @JsonProperty("head")
    public void setHead(String value) { this.head = value; }

    @JsonProperty("before")
    public String getBefore() { return before; }
    @JsonProperty("before")
    public void setBefore(String value) { this.before = value; }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @JsonProperty("commits")
    public List<Commit> getCommits() { return commits; }
    @JsonProperty("commits")
    public void setCommits(List<Commit> value) { this.commits = value; }

    @Override
    public String toString() {
        return "Payload{" +
                "repositoryID=" + repositoryID +
                ", pushID=" + pushID +
                ", size=" + size +
                ", distinctSize=" + distinctSize +
                ", ref='" + ref + '\'' +
                ", refType='" + refType + '\'' +
                ", masterBranch='" + masterBranch + '\'' +
                ", description='" + description + '\'' +
                ", pusherType='" + pusherType + '\'' +
                ", head='" + head + '\'' +
                ", before='" + before + '\'' +
                ", action='" + action + '\'' +
                ", commits=" + commits +
                '}';
    }
}
