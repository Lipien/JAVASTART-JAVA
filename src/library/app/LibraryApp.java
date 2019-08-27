package library.app;

import library.exception.NoSuchFileTypeException;

public class LibraryApp {
    private static final String APP_NAME = "Biblioteka v1.8";

    public static void main(String[] args) {
        System.out.println(APP_NAME);
        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();
    }
}