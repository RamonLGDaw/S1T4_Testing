package nivell2.exercici1.model;

import java.util.Objects;

public class IntegerModel {

    private int value;

    public IntegerModel(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        IntegerModel that = (IntegerModel) object;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
