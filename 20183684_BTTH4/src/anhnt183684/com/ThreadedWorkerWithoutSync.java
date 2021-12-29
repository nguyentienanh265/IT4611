package anhnt183684.com;

public class ThreadedWorkerWithoutSync extends Thread{
    private ResourcesExploiter rExp;

    public ThreadedWorkerWithoutSync(ResourcesExploiter r){
        this.rExp = r;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 1000; i++){
            rExp.exploit();
        }
    }
}
