package anhnt183684.com;

public class ThreadedWorkerWithSync extends Thread{
    private ResourcesExploiter rExp;

    public ThreadedWorkerWithSync(ResourcesExploiter r){
        this.rExp = r;
    }

    @Override
    public void run() {
        super.run();
        synchronized(rExp) {
            for (int i = 0; i < 1000; i++) {
                rExp.exploit();
            }
        }
    }
}
