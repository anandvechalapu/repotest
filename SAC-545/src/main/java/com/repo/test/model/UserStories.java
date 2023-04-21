package com.repo.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class UserStories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String jiraApi;
    private String readableOrganizedDisplay;
    private String realTimeWithoutDelay;
    private String storyTitle;
    private String description;
    private List<String> teamMember;
    private List<String> acceptanceCriteria;
    private List<String> acceptanceTesting;
    private List<String> fetchedFromJiraApi;
    private String definitionOfDone;

    public UserStories() {
    }

    public UserStories(String jiraApi, String readableOrganizedDisplay, String realTimeWithoutDelay, String storyTitle, String description, List<String> teamMember, List<String> acceptanceCriteria, List<String> acceptanceTesting, List<String> fetchedFromJiraApi, String definitionOfDone) {
        this.jiraApi = jiraApi;
        this.readableOrganizedDisplay = readableOrganizedDisplay;
        this.realTimeWithoutDelay = realTimeWithoutDelay;
        this.storyTitle = storyTitle;
        this.description = description;
        this.teamMember = teamMember;
        this.acceptanceCriteria = acceptanceCriteria;
        this.acceptanceTesting = acceptanceTesting;
        this.fetchedFromJiraApi = fetchedFromJiraApi;
        this.definitionOfDone = definitionOfDone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJiraApi() {
        return jiraApi;
    }

    public void setJiraApi(String jiraApi) {
        this.jiraApi = jiraApi;
    }

    public String getReadableOrganizedDisplay() {
        return readableOrganizedDisplay;
    }

    public void setReadableOrganizedDisplay(String readableOrganizedDisplay) {
        this.readableOrganizedDisplay = readableOrganizedDisplay;
    }

    public String getRealTimeWithoutDelay() {
        return realTimeWithoutDelay;
    }

    public void setRealTimeWithoutDelay(String realTimeWithoutDelay) {
        this.realTimeWithoutDelay = realTimeWithoutDelay;
    }

    public String getStoryTitle() {
        return storyTitle;
    }

    public void setStoryTitle(String storyTitle) {
        this.storyTitle = storyTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTeamMember() {
        return teamMember;
    }

    public void setTeamMember(List<String> teamMember) {
        this.teamMember = teamMember;
    }

    public List<String> getAcceptanceCriteria() {
        return acceptanceCriteria;
    }

    public void setAcceptanceCriteria(List<String> acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
    }

    public List<String> getAcceptanceTesting() {
        return acceptanceTesting;
    }

    public void setAcceptanceTesting(List<String> acceptanceTesting) {
        this.acceptanceTesting = acceptanceTesting;
    }

    public List<String> getFetchedFromJiraApi() {
        return fetchedFromJiraApi;
    }

    public void setFetchedFromJiraApi(List<String> fetchedFromJiraApi) {
        this.fetchedFromJiraApi = fetchedFromJiraApi;
    }

    public String getDefinitionOfDone() {
        return definitionOfDone;
    }

    public void setDefinitionOfDone(String definitionOfDone) {
        this.definitionOfDone = definitionOfDone;
    }
}