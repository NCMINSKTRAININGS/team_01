package by.nc.teamone.web.utils;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CheckRoles {
	
	 public boolean isUser(List<String> roles) {
	        return roles.contains("ROLE_USER");
	    }
	 
    public boolean isAdmin(List<String> roles) {
        return roles.contains("ROLE_ADMIN");
    }
}
