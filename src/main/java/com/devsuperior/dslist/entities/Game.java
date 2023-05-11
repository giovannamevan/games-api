package com.devsuperior.dslist.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_game")
public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	private int gameYear;
	private int score;
	private String genre;
	private String platforms;
	private String imgUrl;
	@Column (length = 600)
	private String shortDescription;
	@Column (length = 800)
	private String longDescription;
	
	public Game () {
		
	}

	public Game(Long id, String title, int year, String genre, String platforms, String imgUrl,
			String shortDescription, String longDescription, int score) {
		
		this.id = id;
		this.title = title;
		this.gameYear = year;
		this.genre = genre;
		this.platforms = platforms;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.score = score;
	}

	public int getGameYear() {
		return gameYear;
	}

	public void setGameYear(int gameYear) {
		this.gameYear = gameYear;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return gameYear;
	}

	public void setYear(int year) {
		this.gameYear = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatform() {
		return platforms;
	}

	public void setPlatform(String platform) {
		this.platforms = platform;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
	
}
