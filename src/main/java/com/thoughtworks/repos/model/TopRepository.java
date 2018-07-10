package com.thoughtworks.repos.model;

import java.util.List;

public class TopRepository {
	private String language;
	private long position;
	private long contributors;
	private long stars;
	private long forks;
	private String repository;
	private List<Contributor> topContributors;
	
	public TopRepository() {

	}
	public TopRepository(String language, long position, long contributors, long stars, long forks, String repository, List<Contributor> topContributors) {
		this.language = language;
		this.position = position;
		this.contributors = contributors;
		this.stars = stars;
		this.forks = forks;
		this.repository = repository;
		this.topContributors = topContributors;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public long getPosition() {
		return position;
	}
	public void setPosition(long position) {
		this.position = position;
	}
	public long getContributors() {
		return contributors;
	}
	public void setContributors(long contributors) {
		this.contributors = contributors;
	}
	public long getStars() {
		return stars;
	}
	public void setStars(long stars) {
		this.stars = stars;
	}
	public long getForks() {
		return forks;
	}
	public void setForks(long forks) {
		this.forks = forks;
	}
	public String getRepository() {
		return repository;
	}
	public void setRepository(String repository) {
		this.repository = repository;
	}
	public List<Contributor> getTopContributors() {
		return topContributors;
	}
	public void setTopContributors(List<Contributor> topContributors) {
		this.topContributors = topContributors;
	}
}