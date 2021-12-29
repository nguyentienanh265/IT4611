package anhnt183684.com;

public class ThreadedWorkerWithLock extends Thread{
    private ResourcesExploiterWithLock rExp;

    public ThreadedWorkerWithLock(ResourcesExploiterWithLock r){
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
