package interfases;

import shapes.Circle;

public interface Person {
    public String getName();
    public String getInfo();
    public String getStatus();

    public static void main(String[] args) {
        Person info[] = new Person[3];
        info[0] = new Leader("Ярослав", "Савин", "Владимирович", 2011, "23 432 53");
        info[1] = new Worker("Кирилл", "Савин", "Владимирович", 2015, "35 435 38");
        info[2] = new Client("Дворник", "Уличник", "Тимуривич", 2013, "34 346 10");
        for (int i = 0; i < info.length; i++){
            System.out.println(info[i].getInfo());
        }
        int clientCounter = 0;
        int workerCounter = 0;
        int leaderCounter = 0;
        for (int i = 0; i < info.length; i++) {
            if (info[i] instanceof Leader) {
                leaderCounter++;
            }
            else if (info[i] instanceof Worker){
                workerCounter++;
            }
            else if (info[i] instanceof Client){
                clientCounter++;
            }
        }

    }
}
