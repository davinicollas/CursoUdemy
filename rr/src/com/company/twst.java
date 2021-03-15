package com.company;

import java.util.Objects;

public class twst {
    private String ds;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof twst)) return false;
        twst twst = (twst) o;
        return Objects.equals(ds, twst.ds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ds);
    }
}
