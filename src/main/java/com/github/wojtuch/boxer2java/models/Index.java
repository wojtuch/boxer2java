package com.github.wojtuch.boxer2java.models;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Text;

public class Index
{
	@Attribute
	private int pos;
	
	@Text
	private String index;
	
	public Index()
	{
	}

	public int getPos()
	{
		return pos;
	}

	public void setPos(int pos)
	{
		this.pos = pos;
	}

	public String getIndex()
	{
		return index;
	}

	public void setIndex(String index)
	{
		this.index = index;
	}
}
