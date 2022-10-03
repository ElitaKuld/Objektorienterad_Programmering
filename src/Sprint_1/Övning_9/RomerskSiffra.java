package Sprint_1.Övning_9;

public enum RomerskSiffra {
    I(1, 1),
    V(5, 2),
    X(10, 3),
    L(50, 4),
    C(100, 5),
    D(500, 6),
    M(1000, 7);

    public final int siffervärde;
    public final int uppräkningsOrder;

    RomerskSiffra(int värde, int order) {
        siffervärde = värde;
        uppräkningsOrder = order;
    }

    public int getSiffervärdeFrånOrder(int order) {
        int värdeISiffror = 0;
        if (order == 1)
            värdeISiffror = I.siffervärde;
        else if (order == 2)
            värdeISiffror = V.siffervärde;
        else if (order == 3)
            värdeISiffror = X.siffervärde;
        else if (order == 4)
            värdeISiffror = L.siffervärde;
        else if (order == 5)
            värdeISiffror = C.siffervärde;
        else if (order == 6)
            värdeISiffror = D.siffervärde;
        else if (order == 7)
            värdeISiffror = M.siffervärde;
        return värdeISiffror;
    }

    public int getSiffervärde() {
        return siffervärde;
    }

    public int getUppräkningsOrder() {
        return uppräkningsOrder;
    }
}