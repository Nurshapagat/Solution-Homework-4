package org.example.part_1;

public class ConfigManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        System.out.println("maxPlayers: " + configManager.getConfig("maxPlayers"));
        System.out.println("defaultLanguage: " + configManager.getConfig("defaultLanguage"));

        System.out.println("\nAll Configurations:");
        configManager.printAllConfigs();
    }
}
