package com.govapp.common.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Utilitaires pour la gestion des dates dans l'application GovApp
 */
public class DateUtils {
    
    private static final DateTimeFormatter DEFAULT_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    
    /**
     * Formate une date avec le format par défaut
     * @param dateTime la date à formater
     * @return la date formatée
     */
    public static String formatDateTime(LocalDateTime dateTime) {
        return dateTime != null ? dateTime.format(DEFAULT_FORMATTER) : "";
    }
    
    /**
     * Retourne la date et heure actuelles
     * @return LocalDateTime actuel
     */
    public static LocalDateTime now() {
        return LocalDateTime.now();
    }
    
    /**
     * Retourne la date et heure actuelles formatées
     * @return String de la date actuelle formatée
     */
    public static String nowFormatted() {
        return formatDateTime(now());
    }
}
