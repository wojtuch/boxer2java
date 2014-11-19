package com.github.wojtuch.boxer2java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

public class CommandLine
{
	private static Properties props;
	
	/**
	 * 
	 * Initialises the CommandLine with default properties file.
	 * 
	 * @throws IOException
	 */
	public static void init() throws IOException
	{
		props = new Properties();
		props.load(CommandLine.class.getResourceAsStream("/b2j.properties"));
	}

	/**
	 * 
	 * Initialises the CommandLine with given properties file.
	 * 
	 * @throws IOException
	 */
	public static void init(Properties p)
	{
		props = p;
	}
	
	public static String getAnnotationAsXmlString(String input) throws IOException, InterruptedException, Exception
	{
		if (props == null)
		{
			throw new Exception("Not initialised! Remember to call init() or init(Properties p) method first!");
		}
		
		File tempFile = prepareTempFileWithInput(input);
		
		File parsedCandCFile = parseTextWithCandc(tempFile);
		tempFile.delete();
		
		File annotatedByBoxer = parseCandcWithBoxer(parsedCandCFile);
		parsedCandCFile.delete();
		
		String result = readFileContent(annotatedByBoxer.getAbsolutePath());
		annotatedByBoxer.delete();
		
		return result;
	}

	private static File parseTextWithCandc(File inputFile) throws IOException, InterruptedException
	{
		File tempFile = File.createTempFile(String.valueOf(new Date().getTime()), ".ccg");
		
		String command = prepareCandcCall(inputFile.getAbsolutePath(), tempFile.getAbsolutePath());
		Process p = Runtime.getRuntime().exec(command);
		p.waitFor();
		
		return tempFile;
	}

	private static File parseCandcWithBoxer(File inputFile) throws IOException, InterruptedException
	{
		File tempFile = File.createTempFile(String.valueOf(new Date().getTime()), ".xml");
		
		String command = prepareBoxerCall(inputFile.getAbsolutePath(), tempFile.getAbsolutePath());
		
		Process p = Runtime.getRuntime().exec(command);
		p.waitFor();
		
		return tempFile;
	}
	
	private static String prepareCandcCall(String inputFile, String outputFile)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(props.getProperty("candc_path"));
		sb.append(" --models ");
		sb.append(props.getProperty("candc_models"));
		sb.append(" --input ");
		sb.append(inputFile);
		sb.append(" --output ");
		sb.append(outputFile);		
		return sb.toString();
	}
	
	private static String prepareBoxerCall(String inputFile, String outputFile)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(props.getProperty("boxer_path"));
		sb.append(" --input ");
		sb.append(inputFile);
		sb.append(" --format xml --output ");
		sb.append(outputFile);		
		return sb.toString();
	}
	
	private static File prepareTempFileWithInput(String input) throws IOException
	{
		File tempFile = File.createTempFile(String.valueOf(new Date().getTime()), ".txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));
		bw.write(input);
		bw.newLine();
		bw.close();		
		return tempFile;
	}

	
	private static String readFileContent(String filename) throws FileNotFoundException, IOException 
	{
		StringBuilder result = new StringBuilder();
		
		String line;
		BufferedReader br = new BufferedReader(new FileReader(filename));
		
		while ((line = br.readLine()) != null)
		{
			result.append(line);
		}

		br.close();
		
		return result.toString();
	}
}
