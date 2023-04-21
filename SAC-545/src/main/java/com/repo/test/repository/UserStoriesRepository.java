package com.repo.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserStoriesRepository extends JpaRepository<UserStories, Long> {
    List<UserStories> findByJiraApi();
    List<UserStories> findByReadableOrganizedDisplay();
    List<UserStories> findByRealTimeWithoutDelay();
    List<UserStories> findByStoryTitleAndDescriptionAndTeamMember();
    List<UserStories> findByAllAcceptanceCriteriaAndAcceptanceTesting();
    List<UserStories> findByUserStoriesFetchedFromJiraApi();
    List<UserStories> findByDefinitionOfDone();
}