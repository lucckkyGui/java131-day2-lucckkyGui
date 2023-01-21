package ex1.washingmachine;

class StandardWashingMachine implements WashingMachine{

    @Override
    public void load() {
        System.out.println("pranie załadowane");
    }

    @Override
    public void start() {
        System.out.println("pralka wystartowała");

        for (int i=0;i<10;i++){
            Thread.sleep(1000);
            System.out.println("pranie trwa");
        }
        System.out.println("pranie skończone");

    }

    @Override
    public void unload() {

    }
}
