package com.github.wojtuch.boxer2java.models;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;

import com.github.wojtuch.boxer2java.models.unioninterfaces.DrsMergeAlfa;


public class Merge implements DrsMergeAlfa
{
	@ElementListUnion({
			@ElementList(entry="drs", inline=true, type=Drs.class),
			@ElementList(entry="merge", inline=true, type=Merge.class),
			@ElementList(entry="alfa", inline=true, type=Alfa.class)
	})
	private List<DrsMergeAlfa> dmas;
	
	
	public Merge()
	{
	}


	public List<DrsMergeAlfa> getDMAAlternatives()
	{
		return dmas;
	}


	public void setDMAAlternatives(List<DrsMergeAlfa> dmas)
	{
		this.dmas = dmas;
	}
}
