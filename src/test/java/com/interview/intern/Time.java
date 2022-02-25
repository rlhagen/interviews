package com.interview.intern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Time {

	public String format(String time) {
		Pattern pattern = Pattern.compile("(\\d{2}):(\\d{2}):(\\d{2})([AP]M)");
		Matcher matcher = pattern.matcher(time);
		if(matcher.matches()) {
			String hh = matcher.group(1);
			String mm = matcher.group(2);
			String ss = matcher.group(3);

			if(matcher.group(4).equals("PM")){
				int hour = Integer.parseInt(hh);
				if(hour >= 1 && hour < 12)
					hour = hour + 12;

				hh = String.valueOf(hour);
			}

			return String.format("%s:%s:%s", hh ,mm, ss);
		}

		throw new RuntimeException("Invalid format");
	}

}
