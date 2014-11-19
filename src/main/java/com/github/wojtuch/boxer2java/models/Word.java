package com.github.wojtuch.boxer2java.models;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Text;

public class Word
{
	@Attribute(name="id")
	private String id;
	
	@Text
	private String word;
	
	public Word()
	{
	}
	

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getWord()
	{
		return word;
	}

	public void setWord(String word)
	{
		this.word = word;
	}
}
