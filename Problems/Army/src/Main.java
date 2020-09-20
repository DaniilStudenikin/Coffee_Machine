class Army {

    public static void createArmy() {
        // Implement this method
        Unit unit_1 = new Unit("Axe");
        Unit unit_2 = new Unit("Anti-Mage");
        Unit unit_3 = new Unit("Earth Spirit");
        Unit unit_4 = new Unit("Ember Spirit");
        Unit unit_5 = new Unit("Storm Spirit");
        Knight knight_1 = new Knight("Dragon Knight");
        Knight knight_2 = new Knight("Wraith King");
        Knight knight_3 = new Knight("Monkey King");
        General general = new General("Tresdin");
        Doctor doctor = new Doctor("Witch Doctor");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}