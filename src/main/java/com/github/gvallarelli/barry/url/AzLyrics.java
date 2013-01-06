package com.github.gvallarelli.barry.url;

public class AzLyrics extends Url {

	@Override
	public String getPattern() {
		return "http://www.azlyrics.com/lyrics/%s/%s.html";
	}

	@Override
	public String updateArtist(String artist) {
		return artist.replaceAll(" ", "").toLowerCase();
	}

	@Override
	public String updateLyric(String lyric) {
		return lyric.replaceAll(" ", "").toLowerCase();
	}

}
