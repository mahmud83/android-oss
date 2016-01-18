package com.kickstarter.viewmodels.outputs;

import android.util.Pair;

import com.kickstarter.libs.RefTag;
import com.kickstarter.models.Activity;
import com.kickstarter.models.Project;
import com.kickstarter.services.DiscoveryParams;

import java.util.List;

import rx.Observable;

public interface DiscoveryViewModelOutputs {
  /**
   * Emits a list of projects to display
   */
  Observable<List<Project>> projects();

  /**
   * Emits discovery params when an update to projects and related view elements is needed
   */
  Observable<DiscoveryParams> params();

  /**
   * Emits an activity for the activity sampler view
   */
  Observable<Activity> activity();

  /**
   * Emtis a boolean to determine if onboarding should be shown
   */
  Observable<Boolean> shouldShowOnboarding();

  /**
   * Emits discovery params when filters should be shown
   */
  Observable<DiscoveryParams> showFilters();

  /**
   * Emits a pair containing a project and a ref tag when a project should be shown
   */
  Observable<Pair<Project, RefTag>> showProject();

  /**
   * Emits when the login tout activity should be shown
   */
  Observable<Void> showSignupLogin();

  /**
   * Emits when the activity feed should be shown
   */
  Observable<Void> showActivityFeed();

  /**
   * Emits an activity when an update should be shown
   */
  Observable<Activity> showActivityUpdate();
}