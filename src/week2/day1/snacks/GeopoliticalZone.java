package week2.day1.snacks;

 enum GeoPoliticalZone {
    NORTH_CENTRAL("Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"),
    NORTH_EAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTH_WEST("Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
    SOUTH_EAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTH_SOUTH("Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"),
    SOUTH_WEST("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo");

    private final String[] states;

    GeoPoliticalZone(String... states) {
        this.states = states;
    }

    public static GeoPoliticalZone getZoneByState(String stateName) {
        for (GeoPoliticalZone zone : values()) {
            for (String state : zone.states) {
                if (state.equalsIgnoreCase(stateName)) return zone;
            }
        }
        throw new IllegalArgumentException("State not found in any Nigerian Geo-political zone");
    }
}