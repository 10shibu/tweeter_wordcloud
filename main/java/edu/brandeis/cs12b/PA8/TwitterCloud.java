package edu.brandeis.cs12b.PA8;

	/* 
	 * We're including a lot of import statements for you because several of the classes
	 * You'll be using in this assignment have the same names as classes in other
	 * packages, and we don't want you to get confused and use the wrong one. 
	 * You may not use all of these imports, and you might use some that aren't included
	 * here. That's ok!
	*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.en.EnglishAnalyzer;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.json.JSONObject;

import com.google.common.collect.Lists;
import com.twitter.hbc.ClientBuilder;
import com.twitter.hbc.core.Client;
import com.twitter.hbc.core.Constants;
import com.twitter.hbc.core.Hosts;
import com.twitter.hbc.core.HttpHosts;
import com.twitter.hbc.core.endpoint.StatusesFilterEndpoint;
import com.twitter.hbc.core.processor.StringDelimitedProcessor;
import com.twitter.hbc.httpclient.auth.Authentication;
import com.twitter.hbc.httpclient.auth.OAuth1;

import wordcloud.CollisionMode;
import wordcloud.WordCloud;
import wordcloud.WordFrequency;
import wordcloud.bg.RectangleBackground;
import wordcloud.font.scale.LinearFontScalar;

public class TwitterCloud {
	
	/**
	 * The number of tokens you should extract from tweets
	 */
	private static final int NUMBER_TOKENS = 4000;
	
	/**
	 * Your main client code should go here.
	 * Decide the parameters you want to collect tweets by here, as well as the filename
	 * @param args
	 */
	public static void main(String[] args) {
		TwitterCloud tc = new TwitterCloud();
		//You may use any search terms to test your code, but we're defaulting to 
		//"donald" and "trump" because there will be a lot of results!
		tc.makeCloud(new String[] { "donald", "trump" }, "test.png");
	}

	/**
	 * Create a word cloud! Remember to use all the tools available in your libraries,
	 * make good decisions on which collections to use to store your data,
	 * and create additional methods as necessary. Use the PA PDF as a guide on how 
	 * to use the various libraries to solve the problem.
	 * 
	 * Remember: There are no tests for this PA, so don't worry about edge cases
	 * or handling bad inputs, etc. Just make your code work, keep it organized,
	 * and be creative!
	 * 
	 * @param args an array of strings to use as a filter for incoming Tweets
	 * @param filename the filename of the image file you should create for your word cloud
	 */
	public void makeCloud(String[] args, String filename) {
		// make it happen here! Feel free to throw exceptions.
	}

	/**
	 * This method will only be called after makeCloud
	 * @return a list of all tokenized words from your word cloud
	 */
	public List<String> getWords(){
		return null;
	}
}
