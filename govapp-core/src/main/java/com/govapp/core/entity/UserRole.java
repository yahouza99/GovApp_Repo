package com.govapp.core.entity;

/**
 * Énumération des rôles utilisateur dans l'application gouvernementale
 */
public enum UserRole {
    ADMIN("Administrateur"),
    MANAGER("Gestionnaire"),
    USER("Utilisateur"),
    GUEST("Invité");
    
    private final String displayName;
    
    UserRole(String displayName) {
        this.displayName = displayName;
    }
    
    public String getDisplayName() {
        return displayName;
    }
}
