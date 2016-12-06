package by.nc.teamone.entities.enums;

/**
 * Created by Maksim on 06.12.2016.
 */
public enum UserRole {

    ADMIN("ADMIN"),
    USER("USER");

    private String role;

    private UserRole(String columnName) {
        this.role = columnName;
    }

    public String getRole() {
        return role;
    }
}
