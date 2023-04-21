package com.repo.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.repo.test.model.UserStories;
import com.repo.test.service.UserStoriesService;

@RestController
@RequestMapping("/user-stories")
public class UserStoriesController {

    @Autowired
    private UserStoriesService userStoriesService;

    @GetMapping("/jira-api")
    public List<UserStories> findByJiraApi() {
        return userStoriesService.findByJiraApi();
    }

    @GetMapping("/readable-organized-display")
    public List<UserStories> findByReadableOrganizedDisplay() {
        return userStoriesService.findByReadableOrganizedDisplay();
    }

    @GetMapping("/real-time-without-delay")
    public List<UserStories> findByRealTimeWithoutDelay() {
        return userStoriesService.findByRealTimeWithoutDelay();
    }

    @GetMapping("/story-title-description-team-member")
    public List<UserStories> findByStoryTitleAndDescriptionAndTeamMember() {
        return userStoriesService.findByStoryTitleAndDescriptionAndTeamMember();
    }

    @GetMapping("/all-acceptance-criteria-acceptance-testing")
    public List<UserStories> findByAllAcceptanceCriteriaAndAcceptanceTesting() {
        return userStoriesService.findByAllAcceptanceCriteriaAndAcceptanceTesting();
    }

    @GetMapping("/user-stories-fetched-from-jira-api")
    public List<UserStories> findByUserStoriesFetchedFromJiraApi() {
        return userStoriesService.findByUserStoriesFetchedFromJiraApi();
    }

    @GetMapping("/definition-of-done")
    public List<UserStories> findByDefinitionOfDone() {
        return userStoriesService.findByDefinitionOfDone();
    }

}