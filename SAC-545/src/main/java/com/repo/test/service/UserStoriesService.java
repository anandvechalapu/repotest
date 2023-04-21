package com.repo.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repo.test.model.UserStories;
import com.repo.test.repository.UserStoriesRepository;

@Service
public class UserStoriesService {

    @Autowired
    private UserStoriesRepository userStoriesRepository;

    public List<UserStories> findByJiraApi() {
        return userStoriesRepository.findByJiraApi();
    }

    public List<UserStories> findByReadableOrganizedDisplay() {
        return userStoriesRepository.findByReadableOrganizedDisplay();
    }

    public List<UserStories> findByRealTimeWithoutDelay() {
        return userStoriesRepository.findByRealTimeWithoutDelay();
    }

    public List<UserStories> findByStoryTitleAndDescriptionAndTeamMember() {
        return userStoriesRepository.findByStoryTitleAndDescriptionAndTeamMember();
    }

    public List<UserStories> findByAllAcceptanceCriteriaAndAcceptanceTesting() {
        return userStoriesRepository.findByAllAcceptanceCriteriaAndAcceptanceTesting();
    }

    public List<UserStories> findByUserStoriesFetchedFromJiraApi() {
        return userStoriesRepository.findByUserStoriesFetchedFromJiraApi();
    }

    public List<UserStories> findByDefinitionOfDone() {
        return userStoriesRepository.findByDefinitionOfDone();
    }
}