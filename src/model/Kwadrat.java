package model;

import java.util.Objects;

public class Kwadrat {

    private int a;

    public Kwadrat() {
        a = 1;
    }
    public Kwadrat(int a) {
        this.a = a;
    }

    //przeładowanie konstruktorow

    public int getA() {
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kwadrat kwadrat = (Kwadrat) o;
        return a == kwadrat.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
