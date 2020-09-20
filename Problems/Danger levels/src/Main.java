enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    int num;

    DangerLevel(int i) {
        this.num = i;
    }

    int getLevel() {
        return num;
    }


}
