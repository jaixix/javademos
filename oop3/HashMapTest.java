package oop3;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, Map<String, Object>> userProfiles = new HashMap<String, Map<String, Object>> ();
		Map<String, Object> profile = new HashMap<String, Object>();
		profile.put("age", 25);
		profile.put("Dept.", "Admin");
		profile.put("City", "NY");
		userProfiles.put("John", profile);
		System.out.println(userProfiles);
		
		profile.put("age", 76);
		profile.put("Dept.", "Boss");
		profile.put("City", "DL");
		userProfiles.put("Modi", profile);
		System.out.println(userProfiles);
	}
}
