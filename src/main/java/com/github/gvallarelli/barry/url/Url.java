package com.github.gvallarelli.barry.url;


public abstract class Url {	
	
	public abstract String getPattern();
	
	public abstract String updateArtist(String artist);
	
	public abstract String updateLyric(String lyric);
	
	public String url(String artist, String lyric) {
		String pattern = getPattern();
		String updatedArtist = updateArtist(artist);
		String updatedLyric = updateLyric(lyric);
		return String.format(pattern, updatedArtist, updatedLyric);
	}
}