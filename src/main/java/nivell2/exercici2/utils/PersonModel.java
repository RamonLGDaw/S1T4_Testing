package nivell2.exercici2.utils;

import java.util.Objects;

public class PersonModel {

    private String name;

    public PersonModel(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        PersonModel that = (PersonModel) object;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
