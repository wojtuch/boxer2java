package com.github.wojtuch.boxer2java;

import com.github.wojtuch.boxer2java.models.XdrsOutput;

public class Examples
{	
	public static void main(String[] args) throws Exception
	{
		//successful boxer annotation
		String text = "Barack Hussein Obama II is the 44th and current President of the United States, and the first African American to hold the office. Born in Honolulu, Hawaii, Obama is a graduate of Columbia University and Harvard Law School, where he served as president of the Harvard Law Review.";

		//unsuccessful boxer annotation
		String text2 = "The last skyscraper built in Paris opened in 1973, an unadorned dark block, rising 59 stories - the Montparnasse Tower. It was considered a disaster. To this day, Parisians joke that the tower offers the best views in the city, because it is the only place from which you cannot see it. City officials went to work banning future skyscrapers altogether. Now, however, four decades later, Paris is again considering a new skyscraper - a triangular, 42-story glass office tower designed by the Swiss architects Jacques Herzog and Pierre de Meuron that would stand in the city's southwest corner. Over the years, Parisians have come to embrace some of the city's bolder architectural adventures, such as the glass pyramids inside of the Louvre courtyard or the Pompidou Center, built with its network of colorfully painted water pipes and air-conditioning ducts on the outside. But the resistance to skyscrapers has been fierce.";
		String text3 = "Senate Republicans on Tuesday blocked a sweeping overhaul of the once-secret National Security Agency program that collects records of Americans' phone calls in bulk. Democrats and a handful of Republicans who supported the measure failed to secure the 60 votes they needed to take up the legislation. The vote was 58 to 42 for consideration. Senator Patrick J. Leahy, the Vermont Democrat who drafted the bill, blamed what he said was fear-mongering by the bill's opponents for its defeat. \"Fomenting fear stifles serious debate and constructive solutions,\" he said. \"This nation deserves more than that.\" Senator Mitch McConnell, the Republican leader, worked hard to defeat the bill, which had the support of the Obama administration and a coalition of technology companies including Apple, Google, Microsoft and Yahoo.";
		
		CommandLine.init();
		String xmlAnnotation = CommandLine.getAnnotationAsXmlString(text);
		
		System.out.println(xmlAnnotation);
		
		XdrsOutput xdrsoutput = Boxer2Java.fromString(xmlAnnotation);
		
		String serialized = Boxer2Java.toXmlString(xdrsoutput);
		System.out.println(serialized);
	}
}
