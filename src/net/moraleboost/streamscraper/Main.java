package net.moraleboost.streamscraper;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import net.moraleboost.streamscraper.scraper.IceCastScraper;

public class Main {

	private static final String SOURCE = "http://stream-uk1.radioparadise.com/aac-320";

	public static void main(String[] args) throws ScrapeException, URISyntaxException {
		Scraper scraper = new IceCastScraper();
		List<Stream> streams = scraper.scrape(new URI(SOURCE));
		for(Stream s : streams){
			System.out.println(".:. " + s.toString());
		}
			

	}

}
