package com.hamcrest;

public class TODO {

    private int id;
    private String Summary;
    private String desc;

    public TODO(int id, String summary, String desc) {
        this.id = id;
        Summary = summary;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String summary) {
        Summary = summary;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "TODO{" +
                "id=" + id +
                ", Summary='" + Summary + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
