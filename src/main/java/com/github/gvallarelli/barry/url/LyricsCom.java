package com.github.gvallarelli.barry.url;


public class LyricsCom extends Url {
	
	@Override
	public String getPattern() {
		return "http://www.lyrics.com/%2$s-lyrics-%1$s.html";
	}

	@Override
	public String updateArtist(String artist) {
		return artist.replace(' ', '-');
	}

	@Override
	public String updateLyric(String lyric) {
		return lyric.replace(' ', '-');
	}
}
