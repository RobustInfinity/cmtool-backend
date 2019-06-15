package com.lawtendo.cmtool.application.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Permission {

	private Map<String, List<String>> permissionObj = null;
	
	public Map<String, List<String>> getPermissions(){
		
		if(permissionObj == null) {
			List<String> adminRights = new ArrayList<>();
			//admin routes
			
			
			
			
			List<String> userRights = new ArrayList<>();
			//user routes
			
			
			
			List <String> guestRights = new ArrayList<>();
			//guest routes
			
			
			
			
			permissionObj = new HashMap<String, List<String>>();
			permissionObj.put("admin", adminRights);
			permissionObj.put("user", userRights);
			permissionObj.put("guest", userRights);
			
			return permissionObj;
		}else {
			return permissionObj;
		}
	}
	
}
