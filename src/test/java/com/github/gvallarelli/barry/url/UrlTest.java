package com.github.gvallarelli.barry.url;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.gvallarelli.barry.url.LyricsCom;
import com.github.gvallarelli.barry.url.LyricsWikia;
import com.github.gvallarelli.barry.url.Url;


public class UrlTest {
	
	@Test
	public void lyricsWikiaUrlGivenArtistLyricNames(){
		Url lyricsWikia = new LyricsWikia();
		String lyric = "Bjšrk";
		String artist = "Hyper-Ballad";
		
		String expectedUrl = "http://lyrics.wikia.com/Bjšrk:Hyper-Ballad";
		
		assertEquals(expectedUrl, lyricsWikia.url(artist, lyric));
	}
	
	@Test
	public void lyricsComUrlGivenArtistLyricNames(){
		Url lyricsCom = new LyricsCom();
		String lyric = "Mysterious Ways";
		String artist = "U2";
		
		String expectedUrl =
				"http://www.lyrics.com/Mysterious-Ways-lyrics-U2.html";
		
		assertEquals(expectedUrl, lyricsCom.url(artist, lyric));
	}
	
	@Test
	public void azLyricsUrlGivenArtistLyricNames(){
		Url lyricsCom = new AzLyrics();
		String lyric = "Sultans Of Swing";
		String artist = "Dire Straits";
		
		String expectedUrl =
				"http://www.azlyrics.com/lyrics/direstraits/sultansofswing.html";
		
		assertEquals(expectedUrl, lyricsCom.url(artist, lyric));
	}
}