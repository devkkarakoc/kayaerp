package com.kaya.erp.kayaerp.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public final class AppUtil {

    private static final DateTimeFormatter DEFAULT_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";
    
    // private constructor to prevent instantiation
    private AppUtil() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static String formatDateToLocalDateTime(LocalDateTime dateTime) {
        if (dateTime == null) return "";
        return DEFAULT_FORMATTER.format(dateTime);
    }

    public static LocalDateTime parseDateFromStringToLocalDateTime(String dateStr) {
        return LocalDateTime.parse(dateStr, DEFAULT_FORMATTER);
        
    }
    
    public static Date parseDateFromStringToDate(String dateStr) {
        if (dateStr == null || dateStr.trim().isEmpty()) {
            return null;
        }

        try {
            SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_DATE_PATTERN);
            return sdf.parse(dateStr);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Geçersiz tarih formatı: " + dateStr);
        } 
    }

    public static boolean isStringNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
    
    public static <E> boolean isListNullOrEmpty(List<E> kerem) {
        return kerem == null || kerem.isEmpty();
    }
    
    
    public static  boolean isIntegerNull(Integer ints) {
        return ints == null ;
    }
    
    
        public static <E> boolean isObjectNull(E object) {
            return object == null;
        }
    }

    

    
