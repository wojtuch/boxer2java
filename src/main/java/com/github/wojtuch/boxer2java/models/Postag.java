package com.github.wojtuch.boxer2java.models;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Text;

public class Postag
{
	@Attribute(name="index")
	private String index;
	
	@Text
	private String postag;
	
	public Postag()
	{
	}
	

	public String getIndex()
	{
		return index;
	}

	public void setIndex(String index)
	{
		this.index = index;
	}

	public String getPostag()
	{
		return postag;
	}

	public void setPostag(String postag)
	{
		this.postag = postag;
	}
}
