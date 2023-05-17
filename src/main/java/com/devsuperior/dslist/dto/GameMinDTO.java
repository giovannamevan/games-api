package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;

public class GameMinDTO {
	
	private Long id;
	private String title;
	private int gameYear;
	private String imgUrl;
	private String shortDescription;

	
	public GameMinDTO(Game entity) {
		
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.gameYear = entity.getGameYear();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
	}
	
	public GameMinDTO(GameMinProjection entity) {
		
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.gameYear = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public int getGameYear() {
		return gameYear;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public String getShortDescription() {
		return shortDescription;
	}
	
	
}
