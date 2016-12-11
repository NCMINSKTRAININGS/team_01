package by.nc.teamone.web.utils;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class CheckRoles {
	
	 public boolean isUser(List<String> roles) {
	        if (roles.contains("ROLE_USER")) {
	            return true;
	        }
	        return false;
	    }
	 
    public boolean isAdmin(List<String> roles) {
        if (roles.contains("ROLE_ADMIN")) {
            return true;
        }
        return false;
    }
}
