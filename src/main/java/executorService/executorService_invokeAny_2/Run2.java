package executorService.executorService_invokeAny_2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xianpeng.xia
 * on 2020/5/17 12:22 下午
 */
public class Run2 {

    public static void main(String[] args) {
        try {
            List callables = new ArrayList<>();

            callables.add(new MyCallableA());
            callables.add(new MyCallableC());

            ExecutorService executorService = Executors.newCachedThreadPool();

            String getString = (String) executorService.invokeAny(callables);

            System.out.println("======== " + getString);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("main a");
        } catch (ExecutionException e) {
            e.printStackTrace();
            System.out.println("main b");
        }
    }
}
