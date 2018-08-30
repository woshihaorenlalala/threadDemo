package cc.threaddemo.exercise.second;

import cc.threaddemo.exercise.first.Number;

    /**
     * Created by cc on 2018/8/30.
     */
    public class Main {

        public static void main(String[] args) {
            final Hander hander = new Hander();
            for(int i = 0; i < 3; i++){
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for(int j = 0; j < 5; j++){
                            hander.print(Thread.currentThread().getName());
                        }
                    }
                }).start();
            }
        }
    }
    class Hander{
            private int no = 1;
            private int status = 0;

            public synchronized void print(String threadName){
                int name = Integer.valueOf(threadName.split("-")[1]);
                while(status != name){
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("Thread-" + name + ":");
                for(int i = 0; i < 5; i++){
                    System.out.print(no);
                    if(i >= 0 && i < 4){
                        System.out.print(",");
                    }
                    no++;
                }
                System.out.println();
                status = (status + 1) % 3;
                this.notifyAll();
            }
    }

