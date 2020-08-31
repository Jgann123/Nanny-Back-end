package com.models;

import jdk.jfr.events.CertificateId;

@Document(collection = "families")
public class Families {
    @Id
    public String id;
    public String firstName;
    public String lastName;
    public Int members;
    public String story;
    public String phoneNumbeString;


    public Families() {
    }

    public Families(String id, String firstName, String lastName, Int members, String story, String phoneNumbeString) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.members = members;
        this.story = story;
        this.phoneNumbeString = phoneNumbeString;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Int getMembers() {
        return this.members;
    }

    public void setMembers(Int members) {
        this.members = members;
    }

    public String getStory() {
        return this.story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getPhoneNumbeString() {
        return this.phoneNumbeString;
    }

    public void setPhoneNumbeString(String phoneNumbeString) {
        this.phoneNumbeString = phoneNumbeString;
    }

    public Families id(String id) {
        this.id = id;
        return this;
    }

    public Families firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Families lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Families members(Int members) {
        this.members = members;
        return this;
    }

    public Families story(String story) {
        this.story = story;
        return this;
    }

    public Families phoneNumbeString(String phoneNumbeString) {
        this.phoneNumbeString = phoneNumbeString;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Families)) {
            return false;
        }
        Families families = (Families) o;
        return Objects.equals(id, families.id) && Objects.equals(firstName, families.firstName) && Objects.equals(lastName, families.lastName) && Objects.equals(members, families.members) && Objects.equals(story, families.story) && Objects.equals(phoneNumbeString, families.phoneNumbeString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, members, story, phoneNumbeString);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", members='" + getMembers() + "'" +
            ", story='" + getStory() + "'" +
            ", phoneNumbeString='" + getPhoneNumbeString() + "'" +
            "}";
    }

}