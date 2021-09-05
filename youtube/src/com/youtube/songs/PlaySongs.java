package com.youtube.songs;

import org.testng.annotations.Test;

import com.youtube.genericlib.BaseTest;
import com.youtube.genericlib.FileLib;
import com.youtube.pom.YoutubePom;


public class PlaySongs extends BaseTest{
	
	@Test
	public void ButtaBomma() throws Throwable
	{
		FileLib f = new FileLib();
		String songname = f.readpropdata("songName", Prop_path);
		YoutubePom pom = new YoutubePom();
		pom.playButtabomma(songname);
	}
	
	
	

}
