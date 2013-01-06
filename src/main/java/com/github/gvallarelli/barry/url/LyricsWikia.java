package com.github.gvallarelli.barry.url;


public class LyricsWikia extends Url {
	
	@Override
	public String getPattern() {
		return "http://lyrics.wikia.com/%2$s:%1$s";
	}

	@Override
	public String updateArtist(String artist) {
		return artist;
	}

	@Override
	public String updateLyric(String lyric) {
		return lyric;
	}
}
