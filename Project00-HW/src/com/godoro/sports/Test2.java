package com.godoro.sports;

import java.util.ArrayList;

public class Test2 {
	
	public static void main(String[] args) {
		
		//league
		League league=new League(601,"Superlig");
		league.setTeamList(new ArrayList<>());
		
		//teamA
		Team teamA=new Team(801,"Godoro Spor");
		teamA.setPlayerList(new ArrayList<>());
		
		Player player1=new Player(401,"Teoman Alpay",4.67);
		player1.setTeam(teamA);	
		teamA.getPlayerList().add(player1);
		
		Player player2=new Player(402,"Yusuf Nalkesen",7.89);
		player2.setTeam(teamA);	
		teamA.getPlayerList().add(player2);
		
		Player player3=new Player(404,"Avni Anıl",6.61);
		player3.setTeam(teamA);	
		teamA.getPlayerList().add(player3);
		
		league.getTeamList().add(teamA);

		//teamB
		Team teamB=new Team(802,"Fibiler Spor");
		teamB.setPlayerList(new ArrayList<>());
		
		Player player4=new Player(403,"Yıldırım Gürses",2.93);
		player4.setTeam(teamB);	
		teamB.getPlayerList().add(player4);
		
		Player player5=new Player(405,"Erdoğan Berker",8.11);
		player5.setTeam(teamB);	
		teamB.getPlayerList().add(player5);

		league.getTeamList().add(teamB);
		
		//cıktı
		System.out.println(league.getLeagueId()+" "+league.getLeagueName());
		for (Team team : league.getTeamList()) {
			
			System.out.println("\t"+team.getTeamId()+" "+team.getTeamName());

			for (Player player : team.getPlayerList()) {
				System.out.println( "\t\t"+ player.getPlayerId()+" "
										+player.getPlayerName()+" "
										+player.getAverageScore());
			}
		}	
	}
	
}