package com.github.wojtuch.boxer2java.models;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementUnion;

import com.github.wojtuch.boxer2java.models.unioninterfaces.DrsMergeAlfa;

@Element(name="xdrs")
public class Xdrs
{
	@Attribute(name="id")
	private String id;

	@ElementList(name="words")
	private List<Word> words;

	@ElementList(name="postags")
	private List<Postag> postags;
	
	@ElementList(name="netags", required=false)
	private List<Netag> netags;
	
	@ElementUnion({
		@Element(name="merge", type=Merge.class),
		@Element(name="drs", type=Drs.class),
		@Element(name="alfa", type=Alfa.class)
	})
	private DrsMergeAlfa dma;
	
	public Xdrs()
	{
	}

	public DrsMergeAlfa getDMAAlternative()
	{
		return dma;
	}

	public void setDMAAlternative(DrsMergeAlfa dma)
	{
		this.dma = dma;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public List<Word> getWords()
	{
		return words;
	}

	public void setWords(List<Word> words)
	{
		this.words = words;
	}

	public List<Postag> getPostags()
	{
		return postags;
	}

	public void setPostags(List<Postag> postags)
	{
		this.postags = postags;
	}

	public List<Netag> getNetags()
	{
		return netags;
	}

	public void setNetags(List<Netag> netags)
	{
		this.netags = netags;
	}
}
