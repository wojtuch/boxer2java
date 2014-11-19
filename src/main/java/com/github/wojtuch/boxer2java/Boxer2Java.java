package com.github.wojtuch.boxer2java;

import java.io.File;
import java.io.StringWriter;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.Format;

import com.github.wojtuch.boxer2java.models.XdrsOutput;

/**
 * 
 * Class with static methods for (de)serializing XML output from Boxer tool.
 *
 */
public class Boxer2Java
{
	private static Serializer serializer = new Persister(new Format("<?xml version=\"1.0\"? encoding=\"UTF-8\">"));
	
	/**
	 * Reads given xml String and returns its Java representation.
	 * @param xml
	 * @return
	 * @throws Exception
	 */
	public static XdrsOutput fromString(String xml) throws Exception
	{
		XdrsOutput xdrsoutput = serializer.read(XdrsOutput.class, xml);
		return xdrsoutput;
	}

	/**
	 * Reads given xml file and returns its Java representation.
	 * @param xml
	 * @return
	 * @throws Exception
	 */
	public static XdrsOutput fromFile(File xml) throws Exception
	{
		XdrsOutput xdrsoutput = serializer.read(XdrsOutput.class, xml);
		return xdrsoutput;
	}

	/**
	 * Returns xml representation of the given Java Xdrs object.
	 * @param xml
	 * @return
	 * @throws Exception
	 */
	public static String toXmlString(XdrsOutput xdrs) throws Exception
	{
		StringWriter sw = new StringWriter();
		serializer.write(xdrs, sw);
		String serialized = sw.toString();
		return serialized;
	}
}
