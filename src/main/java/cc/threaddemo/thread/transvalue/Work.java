package cc.threaddemo.thread.transvalue;

/**
 * Created by cc on 2018/8/29.
 */
public class Work {

    public void proceed(Data data, Integer[] numbers){
        for(int n : numbers){
            data.data += n;
        }
    }
}
