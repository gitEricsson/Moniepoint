package day2.firedrill2;

import java.util.Scanner;

public class NokiaSwitchCaseWithReturn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean menuLoop = true;

        while (menuLoop) {
        String prompt = """
                Press 1 -> Phone book
                Press 2 -> Messages
                Press 3 -> Chat
                Press 4 -> Call register
                Press 5 -> Tones
                Press 6 -> Settings
                Press 7 -> Call divert
                Press 8 -> Games
                Press 9 -> Calculator
                Press 10 -> Reminders
                Press 11 -> Clock
                Press 12 -> Profiles
                Press 13 -> SIM services
                Press 0 -> Exit
                """;

        System.out.println(prompt);
        int choice = input.nextInt();

        switch (choice) {
            case 1 -> {
                boolean phoneBookLoop = true;
                while (phoneBookLoop) {
                prompt = """
                        Press 1 -> Search
                        Press 2 -> Service Nos.
                        Press 3 -> Add name
                        Press 4 -> Erase
                        Press 5 -> Edit
                        Press 6 -> Assign tone
                        Press 7 -> Send b'card
                        Press 8 -> Options
                        Press 9 -> Speed dials
                        Press 10 -> Voice tags
                        Press 0 -> Return to Previous Menu
                        """;
                System.out.println(prompt);
                int subChoice = input.nextInt();
                switch (subChoice) {
                    case 1 -> {
                        System.out.println("Search");
                        phoneBookLoop = false;
                        menuLoop = false;
                    }
                    case 2 -> {
                        System.out.println("Service Nos.");
                        phoneBookLoop = false;
                        menuLoop = false;
                    }
                    case 3 -> {
                        System.out.println("Add name");
                        phoneBookLoop = false;
                        menuLoop = false;
                    }
                    case 4 -> {
                        System.out.println("Erase");
                        phoneBookLoop = false;
                        menuLoop = false;
                    }
                    case 5 -> {
                        System.out.println("Edit");
                        phoneBookLoop = false;
                        menuLoop = false;
                    }
                    case 6 -> {
                        System.out.println("Assign tone");
                        phoneBookLoop = false;
                        menuLoop = false;
                    }
                    case 7 -> {
                        System.out.println("Send b'card");
                        phoneBookLoop = false;
                        menuLoop = false;
                    }
                    case 8 -> {
                        boolean optionsLoop = true;
                        while (optionsLoop) {
                        prompt = """
                                Press 1 -> Type of view
                                Press 2 -> Memory status
                                Press 0 -> Return to Previous Menu
                                """;
                        System.out.println(prompt);
                        int optChoice = input.nextInt();
                        switch (optChoice) {
                            case 1 -> {
                                System.out.println("Type of view");
                                optionsLoop = false;
                                phoneBookLoop = false;
                                menuLoop = false;
                            }
                            case 2 -> {
                                System.out.println("Memory status");
                                optionsLoop = false;
                                phoneBookLoop = false;
                                menuLoop = false;
                            }
                            case 0 -> optionsLoop = false;
                            default -> System.out.println("Invalid selection");
                        }
                    }
                }
                    case 9 -> {
                        System.out.println("Speed dials");
                        phoneBookLoop = false;
                        menuLoop = false;
                    }
                    case 10 -> {
                        System.out.println("Voice tags");
                        phoneBookLoop = false;
                        menuLoop = false;
                    }
                    case 0 -> phoneBookLoop = false;
                    default -> System.out.println("Invalid selection");
                }
            }
        }
            case 2 -> {
                boolean messagesLoop = true;
                while (messagesLoop) {
                prompt = """
                        Press 1 -> Write messages
                        Press 2 -> Inbox
                        Press 3 -> Outbox
                        Press 4 -> Picture messages
                        Press 5 -> Templates
                        Press 6 -> Smileys
                        Press 7 -> Message settings
                        Press 8 -> Info service
                        Press 9 -> Voice mailbox number
                        Press 10 -> Service command editor
                        Press 0 -> Return to Previous Menu
                        """;
                System.out.println(prompt);
                int subChoice = input.nextInt();
                switch (subChoice) {
                    case 1 -> {
                        System.out.println("Write messages");
                        messagesLoop = false;
                        menuLoop = false;
                    }
                    case 2 -> {
                        System.out.println("Inbox");
                        messagesLoop = false;
                        menuLoop = false;
                    }
                    case 3 -> {
                        System.out.println("Outbox");
                        messagesLoop = false;
                        menuLoop = false;
                    }
                    case 4 -> {
                        System.out.println("Picture messages");
                        messagesLoop = false;
                        menuLoop = false;
                    }
                    case 5 -> {
                        System.out.println("Templates");
                        messagesLoop = false;
                        menuLoop = false;
                    }
                    case 6 -> {
                        System.out.println("Smileys");
                        messagesLoop = false;
                        menuLoop = false;
                    }
                    case 7 -> {
                        boolean messageSettingsLoop = true;
                        while (messageSettingsLoop) {
                        prompt = """
                                Press 1 -> Set 1
                                Press 2 -> Common
                                Press 0 -> Return to Previous Menu
                                """;
                        System.out.println(prompt);
                        int settingChoice = input.nextInt();
                        switch (settingChoice) {
                            case 1 -> {
                                boolean set1Loop = true;
                                while (set1Loop) {
                                prompt = """
                                        Press 1 -> Message centre number
                                        Press 2 -> Messages sent as
                                        Press 3 -> Message validity
                                        Press 0 -> Return to Previous Menu
                                        """;
                                System.out.println(prompt);
                                int set1Choice = input.nextInt();
                                switch (set1Choice) {
                                    case 1 -> {
                                        System.out.println("Message centre number");
                                        set1Loop = false;
                                        messageSettingsLoop = false;
                                        messagesLoop = false;
                                        menuLoop = false;
                                    }
                                    case 2 -> {
                                        System.out.println("Messages sent as");
                                        set1Loop = false;
                                        messageSettingsLoop = false;
                                        messagesLoop = false;
                                        menuLoop = false;
                                    }
                                    case 3 -> {
                                        System.out.println("Message validity");
                                        set1Loop = false;
                                        messageSettingsLoop = false;
                                        messagesLoop = false;
                                        menuLoop = false;
                                    }
                                    case 0 -> set1Loop = false;
                                    default -> System.out.println("Invalid selection");
                                }
                            }
                            }
                            case 2 -> {
                                boolean commonLoop = true;
                                while (commonLoop) {
                                prompt = """
                                        Press 1 -> Delivery reports
                                        Press 2 -> Reply via same centre
                                        Press 3 -> Character support
                                        Press 0 -> Return to Previous Menu
                                        """;
                                System.out.println(prompt);
                                int commonChoice = input.nextInt();
                                switch (commonChoice) {
                                    case 1 -> {
                                        System.out.println("Delivery reports");
                                        commonLoop = false;
                                        messageSettingsLoop = false;
                                        messagesLoop = false;
                                        menuLoop = false;
                                    }
                                    case 2 -> {
                                        System.out.println("Reply via same centre");
                                        commonLoop = false;
                                        messageSettingsLoop = false;
                                        messagesLoop = false;
                                        menuLoop = false;
                                    }
                                    case 3 -> {
                                        System.out.println("Character support");
                                        commonLoop = false;
                                        messageSettingsLoop = false;
                                        messagesLoop = false;
                                        menuLoop = false;
                                    }
                                    case 0 -> commonLoop = false;
                                    default -> System.out.println("Invalid selection");
                                }
                            }
                        }
                    }
                    }
                }
                    case 8 -> {
                        System.out.println("Info service");
                        messagesLoop = false;
                        menuLoop = false;
                    }
                    case 9 -> {
                        System.out.println("Voice mailbox number");
                        messagesLoop = false;
                        menuLoop = false;
                    }
                    case 10 -> {
                        System.out.println("Service command editor");
                        messagesLoop = false;
                        menuLoop = false;
                    }
                    case 0 -> messagesLoop = false;
                    default -> System.out.println("Invalid selection");
                }
            }
        }
            case 3 -> {
                System.out.println("Chat");
                menuLoop = false;
            }
            case 4 -> {
                boolean callRegisterLoop = true;
                while (callRegisterLoop) {
                prompt = """
                        Press 1 -> Missed calls
                        Press 2 -> Received calls
                        Press 3 -> Dialled numbers
                        Press 4 -> Erase recent call lists
                        Press 5 -> Show call duration
                        Press 6 -> Show call costs
                        Press 7 -> Call cost settings
                        Press 8 -> Prepaid credit
                        Press 0 -> Return to Previous Menu
                        """;
                System.out.println(prompt);
                int subChoice = input.nextInt();
                switch (subChoice) {
                    case 1 -> {
                        System.out.println("Missed calls");
                        callRegisterLoop = false;
                        menuLoop = false;
                    }
                    case 2 -> {
                        System.out.println("Received calls");
                        callRegisterLoop = false;
                        menuLoop = false;
                    }
                    case 3 -> {
                        System.out.println("Dialled numbers");
                        callRegisterLoop = false;
                        menuLoop = false;
                    }
                    case 4 -> {
                        System.out.println("Erase recent call lists");
                        callRegisterLoop = false;
                        menuLoop = false;
                    }
                    case 5 -> {
                        boolean showCallDurationLoop = true;
                        while (showCallDurationLoop) {
                        prompt = """
                                Press 1 -> Last call duration
                                Press 2 -> All calls' duration
                                Press 3 -> Received calls' duration
                                Press 4 -> Dialled calls' duration
                                Press 5 -> Clear timers
                                Press 0 -> Return to Previous Menu
                                """;
                        System.out.println(prompt);
                        int durationChoice = input.nextInt();
                        switch (durationChoice) {
                            case 1 -> {
                                System.out.println("Last call duration");
                                showCallDurationLoop = false;
                                callRegisterLoop = false;
                                menuLoop = false;
                            }
                            case 2 -> {
                                System.out.println("All calls' duration");
                                showCallDurationLoop = false;
                                callRegisterLoop = false;
                                menuLoop = false;
                            }
                            case 3 -> {
                                System.out.println("Received calls' duration");
                                showCallDurationLoop = false;
                                callRegisterLoop = false;
                                menuLoop = false;
                            }
                            case 4 -> {
                                System.out.println("Dialled calls' duration");
                                showCallDurationLoop = false;
                                callRegisterLoop = false;
                                menuLoop = false;
                            }
                            case 5 -> {
                                System.out.println("Clear timers");
                                showCallDurationLoop = false;
                                callRegisterLoop = false;
                                menuLoop = false;
                            }
                            case 0 -> showCallDurationLoop = false;
                            default -> System.out.println("Invalid selection");
                        }
                    }
                    }
                    case 6 -> {
                        boolean showCallCostsLoop = true;
                        while (showCallCostsLoop) {
                        prompt = """
                                Press 1 -> Last call cost
                                Press 2 -> All calls' cost
                                Press 3 -> Clear counters
                                Press 0 -> Return to Previous Menu
                                """;
                        System.out.println(prompt);
                        int costChoice = input.nextInt();
                        switch (costChoice) {
                            case 1 -> {
                                System.out.println("Last call cost");
                                showCallCostsLoop = false;
                                callRegisterLoop = false;
                                menuLoop = false;
                            }
                            case 2 -> {
                                System.out.println("All calls' cost");
                                showCallCostsLoop = false;
                                callRegisterLoop = false;
                                menuLoop = false;
                            }
                            case 3 -> {
                                System.out.println("Clear counters");
                                showCallCostsLoop = false;
                                callRegisterLoop = false;
                                menuLoop = false;
                            }
                            case 0 -> showCallCostsLoop = false;
                            default -> System.out.println("Invalid selection");
                        }
                    }
                    }
                    case 7 -> {
                        boolean callCostSettingsLoop = true;
                        while (callCostSettingsLoop) {
                        prompt = """
                                Press 1 -> Call cost limit
                                Press 2 -> Show costs in
                                Press 0 -> Return to Previous Menu
                                """;
                        System.out.println(prompt);
                        int costSetChoice = input.nextInt();
                        switch (costSetChoice) {
                            case 1 -> {
                                System.out.println("Call cost limit");
                                callCostSettingsLoop = false;
                                callRegisterLoop = false;
                                menuLoop = false;
                            }
                            case 2 -> {
                                System.out.println("Show costs in");
                                callCostSettingsLoop = false;
                                callRegisterLoop = false;
                                menuLoop = false;
                            }
                            case 0 -> callCostSettingsLoop = false;
                            default -> System.out.println("Invalid selection");
                        }
                    }
                    }
                    case 8 -> {
                        System.out.println("Prepaid credit");
                        callRegisterLoop = false;
                        menuLoop = false;
                    }
                    case 0 -> callRegisterLoop = false;
                    default -> System.out.println("Invalid selection");
                }
            }
            }
            case 5 -> {
                boolean tonesLoop = true;
                while (tonesLoop) {
                prompt = """
                        Press 1 -> Ringing tone
                        Press 2 -> Ringing volume
                        Press 3 -> Incoming call alert
                        Press 4 -> Composer
                        Press 5 -> Message alert tone
                        Press 6 -> Keypad tones
                        Press 7 -> Warning and game tones
                        Press 8 -> Vibrating alert
                        Press 9 -> Screen saver
                        Press 0 -> Return to Previous Menu
                        """;
                System.out.println(prompt);
                int subChoice = input.nextInt();
                switch (subChoice) {
                    case 1 -> {
                        System.out.println("Ringing tone");
                        tonesLoop = false;
                        menuLoop = false;
                    }
                    case 2 -> {
                        System.out.println("Ringing volume");
                        tonesLoop = false;
                        menuLoop = false;
                    }
                    case 3 -> {
                        System.out.println("Incoming call alert");
                        tonesLoop = false;
                        menuLoop = false;
                    }
                    case 4 -> {
                        System.out.println("Composer");
                        tonesLoop = false;
                        menuLoop = false;
                    }
                    case 5 -> {
                        System.out.println("Message alert tone");
                        tonesLoop = false;
                        menuLoop = false;
                    }
                    case 6 -> {
                        System.out.println("Keypad tones");
                        tonesLoop = false;
                        menuLoop = false;
                    }
                    case 7 -> {
                        System.out.println("Warning and game tones");
                        tonesLoop = false;
                        menuLoop = false;
                    }
                    case 8 -> {
                        System.out.println("Vibrating alert");
                        tonesLoop = false;
                        menuLoop = false;
                    }
                    case 9 -> {
                        System.out.println("Screen saver");
                        tonesLoop = false;
                        menuLoop = false;
                    }
                    case 0 -> tonesLoop = false;
                    default -> System.out.println("Invalid selection");
                }
            }
            }
            case 6 -> {
                boolean settingsLoop = true;
                while (settingsLoop) {
                prompt = """
                        Press 1 -> Call settings
                        Press 2 -> Phone settings
                        Press 3 -> Security settings
                        Press 4 -> Restore factory settings
                        Press 0 -> Return to Previous Menu
                        """;
                System.out.println(prompt);
                int subChoice = input.nextInt();
                switch (subChoice) {
                    case 1 -> {
                        boolean callSettingsLoop = true;
                        while (callSettingsLoop) {
                        prompt = """
                                Press 1 -> Automatic redial
                                Press 2 -> Speed dialling
                                Press 3 -> Call waiting options
                                Press 4 -> Own number sending
                                Press 5 -> Phone line in use
                                Press 6 -> Automatic answer
                                Press 0 -> Return to Previous Menu
                                """;
                        System.out.println(prompt);
                        int callSetChoice = input.nextInt();
                        switch (callSetChoice) {
                            case 1 -> {
                                System.out.println("Automatic redial");
                                callSettingsLoop = false;
                                settingsLoop = false;
                                menuLoop = false;
                            }
                            case 2 -> {
                                System.out.println("Speed dialling");
                                callSettingsLoop = false;
                                settingsLoop = false;
                                menuLoop = false;
                            }
                            case 3 -> {
                                System.out.println("Call waiting options");
                                callSettingsLoop = false;
                                settingsLoop = false;
                                menuLoop = false;
                            }
                            case 4 -> {
                                System.out.println("Own number sending");
                                callSettingsLoop = false;
                                settingsLoop = false;
                                menuLoop = false;
                            }
                            case 5 -> {
                                System.out.println("Phone line in use");
                                callSettingsLoop = false;
                                settingsLoop = false;
                                menuLoop = false;
                            }
                            case 6 -> {
                                System.out.println("Automatic answer");
                                callSettingsLoop = false;
                                settingsLoop = false;
                                menuLoop = false;
                            }
                            case 0 -> callSettingsLoop = false;
                            default -> System.out.println("Invalid selection");
                        }
                    }
                    }
                    case 2 -> {
                        boolean phoneSettingsLoop = true;
                        while (phoneSettingsLoop) {
                        prompt = """
                                Press 1 -> Language
                                Press 2 -> Cell info display
                                Press 3 -> Welcome note
                                Press 4 -> Network selection
                                Press 5 -> Lights
                                Press 6 -> Confirm SIM service actions
                                Press 0 -> Return to Previous Menu
                                """;
                        System.out.println(prompt);
                        int phoneSetChoice = input.nextInt();
                        switch (phoneSetChoice) {
                            case 1 -> {
                                System.out.println("Language");
                                phoneSettingsLoop = false;
                                settingsLoop = false;
                                menuLoop = false;
                            }
                            case 2 -> {
                                System.out.println("Cell info display");
                                phoneSettingsLoop = false;
                                settingsLoop = false;
                                menuLoop = false;
                            }
                            case 3 -> {
                                System.out.println("Welcome note");
                                phoneSettingsLoop = false;
                                settingsLoop = false;
                                menuLoop = false;
                            }
                            case 4 -> {
                                System.out.println("Network selection");
                                phoneSettingsLoop = false;
                                settingsLoop = false;
                                menuLoop = false;
                            }
                            case 5 -> {
                                System.out.println("Lights");
                                phoneSettingsLoop = false;
                                settingsLoop = false;
                                menuLoop = false;
                            }
                            case 6 -> {
                                System.out.println("Confirm SIM service actions");
                                phoneSettingsLoop = false;
                                settingsLoop = false;
                                menuLoop = false;
                            }
                            case 0 -> phoneSettingsLoop = false;
                            default -> System.out.println("Invalid selection");
                        }
                    }
                    }
                    case 3 -> {
                        boolean securitySettingsLoop = true;
                        while (securitySettingsLoop) {
                        prompt = """
                                Press 1 -> PIN code request
                                Press 2 -> Call barring service
                                Press 3 -> Fixed dialling
                                Press 4 -> Closed user group
                                Press 5 -> Phone security
                                Press 6 -> Change access codes
                                Press 0 -> Return to Previous Menu
                                """;
                        System.out.println(prompt);
                        int secChoice = input.nextInt();
                        switch (secChoice) {
                            case 1 -> {
                                System.out.println("PIN code request");
                                securitySettingsLoop = false;
                                settingsLoop = false;
                                menuLoop = false;
                            }
                            case 2 -> {
                                System.out.println("Call barring service");
                                securitySettingsLoop = false;
                                settingsLoop = false;
                                menuLoop = false;
                            }
                            case 3 -> {
                                System.out.println("Fixed dialling");
                                securitySettingsLoop = false;
                                settingsLoop = false;
                                menuLoop = false;
                            }
                            case 4 -> {
                                System.out.println("Closed user group");
                                securitySettingsLoop = false;
                                settingsLoop = false;
                                menuLoop = false;
                            }
                            case 5 -> {
                                System.out.println("Phone security");
                                securitySettingsLoop = false;
                                settingsLoop = false;
                                menuLoop = false;
                            }
                            case 6 -> {
                                System.out.println("Change access codes");
                                securitySettingsLoop = false;
                                settingsLoop = false;
                                menuLoop = false;
                            }
                            case 0 -> securitySettingsLoop = false;
                            default -> System.out.println("Invalid selection");
                        }
                    }
                }
                    case 4 -> {
                        System.out.println("Restore factory settings");
                        settingsLoop = false;
                        menuLoop = false;
                    }
                    case 0 -> settingsLoop = false;
                    default -> System.out.println("Invalid selection");
                }
            }
        }
            case 7 -> {
                System.out.println("Call divert");
                menuLoop = false;
            }
            case 8 -> {
                System.out.println("Games");
                menuLoop = false;
            }
            case 9 -> {
                System.out.println("Calculator");
                menuLoop = false;
            }
            case 10 -> {
                System.out.println("Reminders");
                menuLoop = false;
            }
            case 11 -> {
                boolean clockLoop = true;
                while (clockLoop) {
                prompt = """
                        Press 1 -> Alarm clock
                        Press 2 -> Clock settings
                        Press 3 -> Date setting
                        Press 4 -> Stopwatch
                        Press 5 -> Countdown timer
                        Press 6 -> Auto update of date and time
                        Press 0 -> Return to Previous Menu
                        """;
                System.out.println(prompt);
                int subChoice = input.nextInt();
                switch (subChoice) {
                    case 1 -> {
                        System.out.println("Alarm clock");
                        clockLoop = false;
                        menuLoop = false;
                    }
                    case 2 -> {
                        System.out.println("Clock settings");
                        clockLoop = false;
                        menuLoop = false;
                    }
                    case 3 -> {
                        System.out.println("Date setting");
                        clockLoop = false;
                        menuLoop = false;
                    }
                    case 4 -> {
                        System.out.println("Stopwatch");
                        clockLoop = false;
                        menuLoop = false;
                    }
                    case 5 -> {
                        System.out.println("Countdown timer");
                        clockLoop = false;
                        menuLoop = false;
                    }
                    case 6 -> {
                        System.out.println("Auto update of date and time");
                        clockLoop = false;
                        menuLoop = false;
                    }
                    case 0 -> clockLoop = false;
                    default -> System.out.println("Invalid selection");
                }
            }
            }
            case 12 -> {
                System.out.println("Profiles");
                menuLoop = false;
            }
            case 13 -> {
                System.out.println("SIM services");
                menuLoop = false;
            }
            case 0 -> menuLoop = false;
            default -> System.out.println("Invalid selection.");        }
    }
}
}