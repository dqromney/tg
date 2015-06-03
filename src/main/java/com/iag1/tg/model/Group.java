package com.iag1.tg.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Group of topics.
 * <p/>
 * Created by dqromney on 5/26/15.
 */
@XmlRootElement
public class Group {

    private String name;
    private String description;

    public Group(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Group{");
        sb.append("name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
