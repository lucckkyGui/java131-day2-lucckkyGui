package ex1.washingmachine;

class FraniaWashingMachine implements WashingMachine{

    @Override
    public void load() {
        //logika ładowania prania - nie ma ważenia
    }

    @Override
    public void start() {
        //logika prania
        //pranie + wirowanie
    }

    @Override
    public void unload() {
        stop();
        //logika wyjmowania ciuchów
        //czy pralka dalej chodzi?
    }

    private void stop() {
        //zatrzymanie frani
    }
}
