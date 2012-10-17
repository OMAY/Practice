package omay.tij.ch_11_inner_classes.ex14;

//TODO: отлично

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}


public class HorrorShow {
    public DangerousMonster newMonster() {
        return new DangerousMonster() {
            @Override
            public void destroy() {
            }

            @Override
            public void menace() {
            }
        };
    }

    public Vampire newVampire() {
        return new Vampire() {
            @Override
            public void drinkBlood() {
            }

            @Override
            public void destroy() {
            }

            @Override
            public void kill() {
            }

            @Override
            public void menace() {
            }
        };
    }

    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    static void w(Lethal l) {
        l.kill();
    }

    static void d(Vampire v) {
        v.drinkBlood();
    }

    public static void main(String[] args) {
        HorrorShow horrorShow = new HorrorShow();
        DangerousMonster barney = horrorShow.newMonster();
        u(barney);
        v(barney);
        Vampire vlad = horrorShow.newVampire();
        u(vlad);
        v(vlad);
        w(vlad);
        d(vlad);
    }
}
