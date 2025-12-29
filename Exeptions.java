class NotEnoughGas extends Exception {
    public NotEnoughGas(String message) {
        super(message);
    }
}

class Explosion extends RuntimeException {
    public Explosion(String message) {
        super(message);
    }
}