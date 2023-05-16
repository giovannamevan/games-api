package com.devsuperior.dslist.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class BelongingPK implements Serializable {
		@ManyToOne
		@JoinColumn(name = "game_id")
		private Game game;
		
		@ManyToOne
		@JoinColumn(name = "list_id")
		private GameList list;
		
		
		
		public BelongingPK(Game game, GameList list) {
			super();
			this.game = game;
			this.list = list;
		}
		public BelongingPK() {
		}
		
		public Game getGame() {
			return game;
		}
		public void setGame(Game game) {
			this.game = game;
		}
		public GameList getList() {
			return list;
		}
		public void setList(GameList list) {
			this.list = list;
		}
		
		
}
